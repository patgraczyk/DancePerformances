package db;

import models.Choreographer;
import models.DanceShow;
import models.Dancer;
import models.PT;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

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


    public static Choreographer getChoreographerofDancer(Dancer dancer){
        session = HibernateUtil.getSessionFactory().openSession();
        Choreographer results = null;
        try {
            Criteria cr = session.createCriteria(Choreographer.class);
            cr.add(Restrictions.eq("dancer", dancer));
            results = (Choreographer)cr.uniqueResult();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
        }

        public static void addDancerToDanceShow(Dancer dancer, DanceShow danceShow){
        dancer.addDanceShow(danceShow);
        DBHelper.update(dancer);
        }


        public static List<DanceShow> getListOfDanceShowsforDancer( Dancer dancer) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<DanceShow> results = null;
        try {
            Criteria cr = session.createCriteria(DanceShow.class);
            cr.createAlias("dancers", "dancer");
            cr.add(Restrictions.eq("dancer.id", dancer.getId()));
            results = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
        }
}

