package dao;

import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements IDao{
    @Override
    public double getdata() {
        System.out.println("version base de donnees ");
        return 65;
    }
}
