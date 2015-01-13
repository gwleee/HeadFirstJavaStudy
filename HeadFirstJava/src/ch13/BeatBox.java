package ch13;

import java.awt.*;
import javax.swing.*;
import javax.sound.midi.*;
import java.util.*;
import java.awt.event.*;

public class BeatBox {
	
	JPanel mainPanel;
	ArrayList<JCheckBox> checkboxList;
	Sequencer sequencer;
	Sequence sequence;
	Track track;
	JFrame theFrame;
	
	String[] instrumentNames = {
			"Bass Drum", "Closed Hi-Hat", " Open Hi-Hat",
			"Acoustic snair", "Crach Cymbal", "Hand Clap",
			"High Tom", " Ho Bongo", " Maracas", "Whistle",
			"Low Conga", "Cowbell", "Vibrasslap", "Low-mid Tom",
			"High Agogo", "Open Hi Conga"			
	};
	
	int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};
	

	public static void main(String ar[]){
		new BeatBox().buildGUI(); 
	}
	
	public void buildGUI(){
		theFrame = new JFrame("Cyber BeatBox");
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout layout = new BorderLayout();
		JPanel background = new JPanel(layout);
		background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		checkboxList = new ArrayList<JCheckBox>();
		Box buttonBox = new Box(BoxLayout.Y_AXIS);
		
		JButton start = new JButton("Start");
	//	start.addActionListener(new MyStartListener());
		
	}
	
	public void setUpMidi(){
		
	}
	
	public void buildTrackAndStart(){
		
	}
	/*
	public class MyStartListener implements ActionListener{
		
	}
	
	public class MyStopListener implements ActionListener{
		
	}
	
	public class MyUpTempoListener implements ActionListener{
		
	}
	
	public class MyDownTempoListener implements ActionListener{
		
	}
	
	public void makeTracks(int[] list){
		
	}
	
	public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick){
		
	}*/
	
}
