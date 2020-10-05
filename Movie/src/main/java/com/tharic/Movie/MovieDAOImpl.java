package com.tharic.Movie;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.metamodel.Metadata;
import org.hibernate.metamodel.MetadataSources;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MovieDAOImpl implements MovieDAO {
	

	@Override
	public void addMovie(Movie m) {
		// TODO Auto-generated method stub
		MovieEntity movieEntity=new MovieEntity();
//		movieEntity.setMovieId(m.getMovieId());
		movieEntity.setLanguage(m.getLanguage());
		movieEntity.setMovieName(m.getMovieName());
		movieEntity.setReleasedIn(m.getReleasedIn());
		movieEntity.setRevenueInDollars(m.getRevenueInDollars());
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.persist(movieEntity);
		tx.commit();
		System.out.println(movieEntity.getMovieName()+" added successfully !!");
		session.close();
	}

	@Override
	public void deleteMovie(String movieId) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		MovieEntity m=(MovieEntity) session.get(MovieEntity.class,movieId);
		session.delete(m);
		tx.commit();
		System.out.println("Deleted Successfully");
		session.close();
	}

	@Override
	public void updateMovieName(String movieId, String movieName) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		MovieEntity m=(MovieEntity) session.get(MovieEntity.class, movieId);
		m.setMovieName(movieName);
		session.update(m);
		tx.commit();
		System.out.println("Upated the movie name to "+movieName);
		session.close();
	}

	@Override
	public void viewMovie(String movieId) {
		// TODO Auto-generated method stub
		Session session= HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		MovieEntity m=(MovieEntity) session.get(MovieEntity.class, movieId);
		if(m!=null) {
			System.out.println("Movie's name: "+m.getMovieName());
		}
		else {
			System.out.println("Movie not found");
		}
	}
}
