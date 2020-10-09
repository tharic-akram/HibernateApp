package com.tharic.Movie;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "movie_details")
@GenericGenerator(name = "idgen",strategy = "increment")
public class MovieEntity {
	@Id
	@GeneratedValue(generator = "idgen")
	private Integer movieId;
	private String movieName;
	private String language;
	private Integer releasedIn;
	private Integer revenueInDollars;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "directorId",unique = true)
	private DirectorEntity directorEntity;
	
	

	public MovieEntity() {
		super();
	}

	public DirectorEntity getDirectorEntity() {
		return directorEntity;
	}

	public void setDirectorEntity(DirectorEntity directorEntity) {
		this.directorEntity = directorEntity;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
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
