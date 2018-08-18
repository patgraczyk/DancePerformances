package db;

import models.DanceShow;
import models.Director;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class DBDanceShow {

    private static Session session;
    private static Transaction transaction;


    public static Director getDirectorOfShow(DanceShow danceShow){
        session = HibernateUtil.getSessionFactory().openSession();
        Director results = null;
        try {
            transaction = session.beginTransaction();
            Criteria cr = session.createCriteria(Director.class);
            cr.add(Restrictions.eq("danceshow", danceShow.getDirector()));
            results = (Director)cr.uniqueResult();
        } catch (HibernateException ex){
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }
}
