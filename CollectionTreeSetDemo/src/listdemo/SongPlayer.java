package listdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class SongPlayer {

	/**
	 * This method will start the song player and get the list of songs
	 */
	public void start() {
		// TODO get the song list.
		List<Song> songList= getSongs();
		System.out.println("--------Before Sorting-----------");
		for (Song song : songList) {
			System.out.println(song);
		}
		
		
		// Lambda Expression will not create object. it just to execute the functionality.
		Collections.sort(songList, (s1, s2)-> s1.getTitle().compareTo(s2.getTitle())); // Java 8 Lambda Expression
		
		System.out.println("--------After Sorting-----------");
		for (Song song : songList) {
			System.out.println(song);
		}
		
		//No Duplicate Allowed, Sorted and Ordered
		System.out.println("--------After Converting in TreeSet-----------");
		TreeSet<Song> songTreeSet =  new TreeSet<>();
		songTreeSet.addAll(songList);
		for (Song song : songTreeSet) {
			System.out.println(song);
		}
		
	}

	/**
	 * Read the songlist.txt file and separate only songs and return the songs list
	 * @return
	 */
	private List<Song> getSongs() {
		List<Song> listOfSongs = new ArrayList<>();
		try {
			File file =  new File("songlist.txt");
			BufferedReader br=new BufferedReader(new FileReader(file));
			String newSong=null;
			while((newSong = br.readLine())!=null) {
				String []tokens = newSong.split("/");
				listOfSongs.add(new Song(tokens[0], tokens[1], tokens[2], tokens[3]));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return listOfSongs;
	}

}
