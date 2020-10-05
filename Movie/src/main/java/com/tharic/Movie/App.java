package com.tharic.Movie;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Director d=new Director(101,"Gautham menon", 10000);
        Movie m=new Movie(1006, "Achcham Enbadhu Madamayadaa", "Tamil",2018, 1100,d);
        MovieDAO dao=new MovieDAOImpl();
        dao.addMovie(m);
//        dao.viewMovie("1004");
//        dao.updateMovieName("1002","Osthii");
//        dao.deleteMovie("1003");
    }
}
