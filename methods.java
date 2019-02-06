import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class methods extends JPanel {
	ArrayList<String> french;
	ArrayList<String> english; {
	//calling up the array list
	english = new ArrayList<String>();
	french = new ArrayList<String>(); }
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public methods() {
		// TODO Auto-generated constructor stub
		english = new ArrayList<String>();
		french = new ArrayList<String>();
		//here are my english and french methods 
		
		loadEnglishWords();
		LoadFrenchWords();
		mainloop();
	}

	private void loadEnglishWords() {
		// TODO Auto-generated method stub
		File f = new File("C://users/hanse/Desktop/english.txt");
		// reading up the english words from the english file
		try {
			Scanner s = new Scanner(f);
			while (s.hasNext()) {
				String temp = s.nextLine();
				
				//System.out.println(temp);
				english.add(temp);
			}
			s.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Hey! I could not find english.txt");}
	
	}
	private void LoadFrenchWords() {
		// TODO Auto-generated method stub
		File f = new File("C://users/hanse/Desktop/french1.txt");
		//reading up all of the french words from the french file
		
		try {
			Scanner s = new Scanner(f);
			while (s.hasNext()) {
				String temp = s.nextLine();
				
				//System.out.println(temp);
				french.add(temp);
			}
			s.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,"Hey! I could not find french1.txt");}
	}
	private String lookup (String time) {
		//asigning the english and the french together
		for (int i = 0; i<english.size(); i ++) {
			if (time.equals(english.get(i))) {
				return french.get(i);
			}
				}
			return ("no match foud");
			
			}
		
	private void mainloop() {
		// TODO Auto-generated method stub
		while (true) {
			String tow = JOptionPane.showInputDialog(null, "Please show me english!", "thou shalt Translate!");
			//putting in the joption panes to put in the english and french 
			String retrival = lookup (tow);
			int retrived = JOptionPane.showConfirmDialog(null,"Das French hath: " + retrival + "." ,"Want to play again?", JOptionPane.YES_NO_OPTION);
			if (retrived == JOptionPane.NO_OPTION) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	JFrame window = new JFrame();
	window.setContentPane(new methods());
//creating the jframe window 
	}

}
