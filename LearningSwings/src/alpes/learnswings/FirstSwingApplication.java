package alpes.learnswings;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;

public class FirstSwingApplication{
	public void showGUI(){
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenu menubar=new JMenu();
		menubar.setOpaque(true);
		menubar.setBackground(new Color(12));
		menubar.setPreferredSize(new Dimension(200, 20));
		
		JLabel label=new JLabel();
		label.setOpaque(true);
		label.setBackground(new Color(123,332,124));
		
		//JPanel mainPanel=new JPanel();
	
	}
	
/*	public static void main(String[] args){
		FirstSwingApplication ob=new FirstSwingApplication();
		ob.showGUI();
	}*/
}
