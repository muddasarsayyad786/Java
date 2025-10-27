package SongAss;

import java.util.Objects;
import java.util.Set;

//Song has a serialno, title, set of artists ,release year and rating

public class Song {
	int serialno;
	String title;
	Set<String> artists;
	int ryear;
	int rating;
	
	public Song(int serialno, String title, Set<String> artists, int ryear, int rating) {
		
		this.serialno = serialno;
		this.title = title;
		this.artists = artists;
		this.ryear = ryear;
		this.rating = rating;
	}

	public int getSerialno() {
		return serialno;
	}

	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<String> getArtists() {
		return artists;
	}

	public void setArtists(Set<String> artists) {
		this.artists = artists;
	}

	public int getRyear() {
		return ryear;
	}

	public void setRyear(int ryear) {
		this.ryear = ryear;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Song [serialno=" + serialno + ", title=" + title + ", artists=" + artists + ", ryear=" + ryear
				+ ", rating=" + rating + "]";
	}
	
	
	
	
}


