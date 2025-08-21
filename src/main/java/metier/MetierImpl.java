package metier;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {
    private IDao dao;
//@Autowired
//@Qualifier()
    public void setDao(IDao dao) {
        this.dao = dao;
    }
//   public  MetierImpl(IDao dao) {
//        this.dao=dao;
//    }
    @Override
    public double calcul() {
        double d=dao.getdata();
        double data=10*d;
    return data;
    }
}
