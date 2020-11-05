package listdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SongPlayer {

	/**
	 * This method will start the song player and get the list of songs
	 */
	public void start() {
		// TODO get the song list.
		List<Song> songList= getSongs();
		System.out.println("--------Before Sorting-----------");
		System.out.println(songList);
		Collections.sort(songList);
//		TreeSet sortedSongs =  new TreeSet<>(songList);
		System.out.println("--------After Sorting-----------");
		System.out.println(songList);
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
