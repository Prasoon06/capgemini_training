package listdemo;

import java.util.Comparator;

public class SongAuthorComparator implements Comparator<Song>{

	@Override
	public int compare(Song s1, Song s2) {
		return s1.getAuthor().compareTo(s2.getAuthor());
	}

}
