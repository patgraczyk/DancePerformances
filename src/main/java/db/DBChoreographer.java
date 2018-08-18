package db;

import models.Choreographer;
import models.Dancers.Dancer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBChoreographer {

    private static Session session;

    public static List<Dancer> getDanceCrew(Choreographer choreographer) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Dancer> results = null;
        try {
            Criteria cr = session.createCriteria(Dancer.class);
            cr.add(Restrictions.eq("choreographer", choreographer));
            results = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return results;
    }
}
