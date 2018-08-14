package db;

import models.Director;
import models.Film;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.Dictionary;
import java.util.List;

public class DBDirector {
    private static Session session;
    private static Transaction transaction;

    public static List<Film> getfilmCatalogueForDirector(Director director){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Film> result = null;
        try{
            Criteria cr = session.createCriteria(Film.class);
            cr.add(Restrictions.eq("director", director));
            result = cr.list();
        } catch(HibernateException ex){
            ex.printStackTrace();
        } finally{
            session.close();
        } return result;
    }

}
