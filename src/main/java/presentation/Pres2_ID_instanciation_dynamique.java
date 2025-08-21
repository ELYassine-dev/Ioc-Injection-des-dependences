package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2_ID_instanciation_dynamique {
    public static void main(String[] args) throws Exception {


    //DI instanciation dynamique
    File fil=new File("C:\\Users\\HF\\Desktop\\todos\\Springboot\\IoC_ID_activite1\\Config.text");
    Scanner sc;

    {
        try {
            sc = new Scanner(fil);
            String daoClass=sc.nextLine();
            Class cdao=Class.forName(daoClass);
            IDao dao=(IDao) cdao.newInstance();

            String metierClass=sc.nextLine();
            Class cmetier=Class.forName(metierClass);
//           IMetier metier=(IMetier) cmetier.newInstance();
            IMetier metier=(IMetier) cmetier.getConstructor().newInstance();
            //ID
//          Method mth=cmetier.getMethod("setDao",IDao.class);
            Method mth=cmetier.getDeclaredMethod("setDao", IDao.class);


            mth.invoke(metier,dao);
            System.out.println("resultat : "+ metier.calcul());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
}
