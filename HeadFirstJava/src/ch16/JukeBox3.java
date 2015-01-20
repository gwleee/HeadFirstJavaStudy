package ch16;

import java.util.*;
import java.io.*;

public class JukeBox3 {
	
	ArrayList<Song> songList = new ArrayList<Song>();
	
	public static void main(String ar[]){
		new JukeBox3().go();
	}
	
	public void go(){
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
	}
	
	void getSongs(){
		try{
			File file = new File("Data/SongList2.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = null;
			
			while((line = br.readLine()) != null){
				addSong(line);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	void addSong(String lineToParse){
		String[] tokens = lineToParse.split("/");
		
		Song nextSong = new Song(tokens[0],tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
	}

}
