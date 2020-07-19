package repositories;

import entities.Movie;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateUtil;

import java.util.List;
public class MovieRepository {
    public List<Movie> findMovies(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Movie");
        List<Movie> movieList = query.list();
        return movieList;
    }
}