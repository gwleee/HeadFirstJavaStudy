package ch16;

import java.util.*;
import java.io.*;

public class JukeBox1 {
	
	ArrayList<String> songList = new ArrayList<String>();
	
	public static void main(String ar[]){
		new JukeBox1().go();
	}
	
	public void go(){
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
	}
	
	void getSongs(){
		try{
			File file = new File("Data/SongList.txt");
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
		songList.add(tokens[0]);
	}

}
