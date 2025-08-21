package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component
public class DaoImpl3 implements IDao {
    @Override
    public double getdata() {
        System.out.println("version capteur ");
        return 265;
    }
}
