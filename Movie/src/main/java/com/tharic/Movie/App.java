package com.tharic.Movie;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Director d=new Director(102,"STR", 1000);
//        Movie m=new Movie(1009, "Vallavan", "Tamil",2008, 500,d);
        MovieDAO dao=new MovieDAOImpl();
//        dao.addMovie(m);
        dao.fetchMoviesbyRevenue(1000);
//        dao.viewMovie("1004");
//        dao.updateMovieName("1002","Osthii");
//        dao.deleteMovie("1003");
    }
}
