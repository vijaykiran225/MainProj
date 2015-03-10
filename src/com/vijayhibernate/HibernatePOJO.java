package com.vijayhibernate;

import java.sql.Timestamp;

public class HibernatePOJO {

	 
	private int id 	;
	private String title 	;
	private String artist 	;
	private String  album 	;
	private String genre 	;
	private String  releasedate;
	private int duration 	;
	private String author; 	
	private Timestamp playdate 	;
	private int rating;
	
	public HibernatePOJO() {
	}

	public HibernatePOJO(String title, String artist, String album,
			String genre, String releasedate, int duration, String author,
			Timestamp playdate, int rating) {
		super();
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.genre = genre;
		this.releasedate = releasedate;
		this.duration = duration;
		this.author = author;
		this.playdate = playdate;
		this.rating = rating;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	/**
	 * @return the playdate
	 */
	public Timestamp getPlaydate() {
		return playdate;
	}
	/**
	 * @param playdate the playdate to set
	 */
	public void setPlaydate(Timestamp playdate) {
		this.playdate = playdate;
	} 		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "HibernatePOJO [id=" + id + ", title=" + title + ", artist="
				+ artist + ", album=" + album + ", genre=" + genre
				+ ", releasedate=" + releasedate + ", duration=" + duration
				+ ", author=" + author + ", playdate=" + playdate + ", rating="
				+ rating + "]";
	}
}
