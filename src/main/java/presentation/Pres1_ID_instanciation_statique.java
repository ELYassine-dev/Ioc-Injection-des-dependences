package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres1_ID_instanciation_statique {
    public static void main(String[] args) {
        // injection de dependence instanciation statique
        DaoImpl dao =new DaoImpl();
//        MetierImpl metier=new MetierImpl(dao);
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println("resultat : "+metier.calcul());
    }
}
