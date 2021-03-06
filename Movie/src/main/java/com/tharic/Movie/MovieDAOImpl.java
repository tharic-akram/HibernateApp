package com.tharic.Movie;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
		DirectorEntity directorEntity=new DirectorEntity(m.getDirector().getDirectorId(), m.getDirector().getDirectorName(), m.getDirector().getSalary());
		movieEntity.setDirectorEntity(directorEntity);
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
//		session.persist(directorEntity);
		session.save(movieEntity);
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

	@Override
	public void fetchMoviesbyRevenue(Integer dollars) {
		// TODO Auto-generated method stub
		Session session= HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		String query=" from MovieEntity m where m.revenueInDollars >= :dollars";
		Query q=session.createQuery(query);
		q.setParameter("dollars", dollars);
		List<MovieEntity> list=q.list();
		for(MovieEntity m:list) {
			System.out.println(m.getMovieId() +" "+ m.getMovieName() +" ");
		}
		session.close();
	}
}
