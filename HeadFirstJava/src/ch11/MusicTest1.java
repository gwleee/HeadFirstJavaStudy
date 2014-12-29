//test git

package ch11;

import javax.sound.midi.*;

public class MusicTest1 {
	public void play(){
		try{
		Sequencer sequencer = MidiSystem.getSequencer();
		
		System.out.println("we got a sequencer");
		}catch(MidiUnavailableException ex){
			System.out.println("bummer");
		}
	}
	
	public static void main(String ar[]){
		MusicTest1 mt = new MusicTest1();
		mt.play();
	}

}
