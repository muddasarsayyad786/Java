package SongAss;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import Collections.DuplicateSongException;
import Collections.RyearCompatator;
import Collections.TitalComparator;


public class Collections {
	
	List<Song> song = new ArrayList<>();
	{
		song.add(new Song(1,"Tum hi ho",Set.of("Arjit","Sherya"),2025,4));
		song.add(new Song(2, "Shape of You", Set.of("Ed Sheeran"), 2025, 5));
		song.add(new Song(3, "Blinding Lights", Set.of("The Weeknd", "Daft Punk"), 2019, 4));
		song.add(new Song(4, "Bohemian Rhapsody", Set.of("Queen"), 1975, 5));
        song.add(new Song(5, "Perfect", Set.of("Ed Sheeran", "Beyonce"), 2017, 4));
        song.add(new Song(6, "Believer", Set.of("Imagine Dragons"), 2025, 4));
	}
	
	public void add() throws DuplicateSongException{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Serial no: ");
		int sr = sc.nextInt();
		
		System.out.println("Enter Song name: ");
		String sname = sc.next();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the artist's name: ");
		String artist = scanner.nextLine();
		Set<String> a = new HashSet();
		
		
		
        
        for (String art: artist.split(",")) {
        	a.add(artist);
        }
        
        
		System.out.println("Enter Rating: ");
		int rating = sc.nextInt();
		
		System.out.println("Enter resle year: ");
		int year = sc.nextInt();
		
		for (Song s : song) {
			if (s.title.equalsIgnoreCase(sname)) {
				throw new DuplicateSongException("Song already exists");
			}
			
		}
		
		
		song.add(new Song(sr,sname,null,year,rating));
		System.out.print("Song added to collection");
	}
	
	public void modify() {
		System.out.print("Enter song name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		for (Song s : song) {
			if (s.getTitle().equals(name)){
				s.setRyear(2027);
				break;
				
			}
		}
		
	}
	
	public void delete() {
		
		System.out.print("Enter song name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		for (Song s : song) {
			if (s.getTitle().equals(name)){
				song.remove(s);
				System.out.println("Song Deleted");
				break;
				
			}
		
	}

}
	public void displayList() {
		for (Song s : song) {
			System.out.println(s);
		}
		
	}
	
	public void sort() {
		song.sort(new TitalComparator());
		
		displayList();
	}
	
	public void searchByTitle(String name) {
		for(Song s : song) {
			if (s.title.equalsIgnoreCase(name)) {
				System.out.print(s);
			}
		}
	}
	
	public void currentYear() {
		
		LocalDate date = LocalDate.now();
		int year = date.getYear();
		
		for (Song s: song) {
			if (s.getRyear() == year) {
				System.out.println(s.title);
			}
		}
	}
	
	
	public void MinMaxRating() {
		
		int minRating = Integer.MAX_VALUE;
		int maxRating = Integer.MIN_VALUE;
		
		for (Song s : song) {
			if (s.rating < minRating) {
				minRating = s.rating;
			}
		}
		
		for (Song s : song) {
			if (s.rating > maxRating) {
				maxRating = s.rating;
			}
		}
		
		System.out.println("Mininum Rating: "+minRating);
		System.out.println("Maximum Rating: "+maxRating);
		
	}
	
	public void songbyYear() {
		System.out.println("--------Song--------Year---------");
		for (Song s:song) {
			System.out.println(s.title+"        "+s.ryear);
		}
	}
	
	public void sortByYear() {
		song.sort(new RyearCompatator());
		
		displayList();
		
		
	}
	
}
