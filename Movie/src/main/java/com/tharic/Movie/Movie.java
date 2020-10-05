package com.tharic.Movie;

public class Movie {
	private String movieId;
	private String movieName;
	private String language;
	private Integer releasedIn;
	private Integer revenueInDollars;
	
	public Movie() {
		super();
	}
	

	public Movie(String movieId, String movieName, String language, Integer releasedIn, Integer revenueInDollars) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.language = language;
		this.releasedIn = releasedIn;
		this.revenueInDollars = revenueInDollars;
	}


	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getReleasedIn() {
		return releasedIn;
	}

	public void setReleasedIn(Integer releasedIn) {
		this.releasedIn = releasedIn;
	}

	public Integer getRevenueInDollars() {
		return revenueInDollars;
	}

	public void setRevenueInDollars(Integer revenueInDollars) {
		this.revenueInDollars = revenueInDollars;
	}
	
	

}