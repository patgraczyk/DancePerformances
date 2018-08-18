package db;

import models.Dancer;
import models.PT;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class DBDancer {

    private static Session session;


    public static PT getPTForDancer(Dancer dancer){
        session = HibernateUtil.getSessionFactory().openSession();
        PT pt = null;
        try {
            Criteria cr = session.createCriteria(PT.class);
            cr.add(Restrictions.eq("dancer", dancer));
            pt = (PT)cr.uniqueResult();
        } catch (HibernateException ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return pt;
    }


}
