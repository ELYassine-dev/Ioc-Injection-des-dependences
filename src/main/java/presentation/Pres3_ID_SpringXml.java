package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pres3_ID_SpringXml {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ConfigSpringXml.xml");
//        IMetier metier= context.getBean(IMetier.class);
        IMetier metier=(IMetier)context.getBean("met");
        System.out.println("resultat : "+ metier.calcul());



    }
}
