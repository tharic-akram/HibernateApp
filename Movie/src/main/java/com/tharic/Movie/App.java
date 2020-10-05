package com.tharic.Movie;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Movie m=new Movie("1001", "Vinnaithandi Varuvaaya", "Tamil",2010, 1000);
        MovieDAO dao=new MovieDAOImpl();
//        dao.addMovie(m);
//        dao.viewMovie("1004");
//        dao.updateMovieName("1002","Osthii");
        dao.deleteMovie("1003");
    }
}
