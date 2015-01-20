package ch14;

import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class QuizCardBuilder {
	private JTextArea question;
	private JTextArea answer;
//	private ArrayList<QuizCard> cardList;
	private JFrame frame;
	
	public static void main(String ar[]){
		QuizCardBuilder builder = new QuizCardBuilder();
		builder.go();
	}
	
	public void go(){
		frame = new JFrame("Quiz card builder");
		JPanel mainPanel = new JPanel();
		Font bigFont = new Font("sanserif", Font.BOLD, 24);
		question = new JTextArea(6,20);
		question.setLineWrap(true);
		question.setWrapStyleWord(true);
		question.setFont(bigFont);
		
		JScrollPane qScroller = new JScrollPane(question);
		
	}

}
