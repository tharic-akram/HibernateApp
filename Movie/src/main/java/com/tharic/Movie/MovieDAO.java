package com.tharic.Movie;

public interface MovieDAO {
	public void addMovie(Movie m);
	
	public void deleteMovie(String movieId);
	
	public void updateMovieName(String movieId, String movieName);
	
	public void viewMovie(String movieId);
	
	public void fetchMoviesbyRevenue(Integer dollars);
}
