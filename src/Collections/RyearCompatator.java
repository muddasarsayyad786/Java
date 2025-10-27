package Collections;

import java.util.Comparator;

import SongAss.Song;

public class RyearCompatator implements Comparator<Song> {

	@Override
	public int compare(Song o1, Song o2) {
		return o1.getRyear()-o2.getRyear();
		
		
	}

}
