package fr.windowJava.package_dev;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class GraphConsole extends JFrame{
	
	
	private JButton [] Boutons;
	
	/**
	 * Constructor GraphConsol
	 * @return
	 * @param
	 */
	public GraphConsole() {
		Boutons = new JButton[10];
		setSize(1024,678);
		setLocation(200,200);
		setTitle("Console");
		setLayout(new GridLayout(3,4));
		for(int i=0;i<Boutons.length;i++) {
			Boutons[i] = new JButton("Bouton"+i);
			add(Boutons[i]);
		}
		
			
	}
}
