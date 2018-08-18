package db;

import models.DanceShow;
import models.Director;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBDirector {

    private static Session session;

    public static List<DanceShow> getDanceShowsOfDirector(Director director){
        session = HibernateUtil.getSessionFactory().openSession();
        List<DanceShow> results = null;
        try {

            Criteria cr = session.createCriteria(DanceShow.class);
            cr.add(Restrictions.eq("director", director));
            results = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }
}
