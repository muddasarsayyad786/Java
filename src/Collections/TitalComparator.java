package Collections;

import java.util.Comparator;

import SongAss.Song;

public class TitalComparator implements Comparator<Song> {

	@Override
	public int compare(Song o1, Song o2) {
		return o1.getTitle().compareToIgnoreCase(o2.getTitle());
		
		
	}

	

}
