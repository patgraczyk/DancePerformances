package db;

import models.Dancer;
import models.PT;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class DBPT {

    private static Session session;

//    public static Dancer getDancerForPT(PT pt) {
//        session = session.getSessionFactory().openSession();
//        Dancer results = null;
//        try {
//            Criteria cr = session.createCriteria(PT.class);
//            cr.add(Restrictions.eq("pt", pt));
//            results = (Dancer) cr.uniqueResult();
//        } catch (HibernateException ex){
//            ex.printStackTrace();
//        }finally {
//            session.close();
//        }
//        return results;
//    }
}
