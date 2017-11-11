package fr.windowJava.package_dev;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class essai1 extends JFrame{

	public essai1() {
		setSize(350,220);
		setLocation(200,200);
		
		/* Exercice 1 */

		/*setTitle("essai 1");
		JPanel panel1= new JPanel();
		JPanel panel2= new JPanel();
		JPanel panel3= new JPanel();
		
		JButton bHaut = new JButton("Haut");
		JButton bBas = new JButton("Bas");
		JButton[] bNumber = new JButton[10];
		for(int i=0;i<bNumber.length;i++) {
			bNumber[i] = new JButton("Numero "+i);
			panel2.add(bNumber[i]);
		}
		this.add(bHaut,BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		this.add(bBas,BorderLayout.SOUTH);*/
		
		
		/* Exercice 2 */
		
		/*setTitle("Calculatrice");
		JTextField text = new JTextField("0",20);
		this.add(text,BorderLayout.NORTH);
		
		JPanel testPanel = new JPanel();
		testPanel.setLayout(new GridLayout(4,4));
		
		JButton[] bPanel = new JButton[16];
		bPanel[0] = new JButton("7");
		bPanel[1] = new JButton("8");
		bPanel[2] = new JButton("9");
		bPanel[3] = new JButton("/");
		bPanel[4] = new JButton("4");
		bPanel[5] = new JButton("5");
		bPanel[6] = new JButton("6");
		bPanel[7] = new JButton("*");
		bPanel[8] = new JButton("1");
		bPanel[9] = new JButton("2");
		bPanel[10] = new JButton("3");
		bPanel[11] = new JButton("-");
		bPanel[12] = new JButton("0");
		bPanel[13] = new JButton(".");
		bPanel[14] = new JButton("=");
		bPanel[15] = new JButton("+");
		
		for(int i=0;i<bPanel.length;i++) {
			testPanel.add(bPanel[i]);
		}
		
		this.add(testPanel, BorderLayout.CENTER);*/
		
		/* Exercice 3 */
		
		/*String[] dataCombo = {"Choice_1", "Choice_2", "Choice_3"};
		JComboBox<String> combo = new JComboBox<String>(dataCombo);
		JRadioButton r1 = new JRadioButton("Rouge");
		JRadioButton r2 = new JRadioButton("Bleu");
		JRadioButton r3 = new JRadioButton("Vert");
		ButtonGroup gp = new ButtonGroup();
		JCheckBox cb = new JCheckBox("Italique");
		JCheckBox cb2 = new JCheckBox("Gras");
		
		
		JLabel label = new JLabel("Couleur de texte : ");
		JLabel label2 = new JLabel("Couleur du fond : ");
		JLabel label3 = new JLabel("Style : ");
		
		setTitle("essai 3");
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		p1.setBackground(Color.GREEN);
		p2.setBackground(Color.YELLOW);
		p3.setBackground(Color.BLUE);
		
		p1.setPreferredSize(new Dimension(350,60));
		p2.setPreferredSize(new Dimension(350,73));
		p3.setPreferredSize(new Dimension(350,60));
		
		r1.setSelected(true);
		gp.add(r1);
		gp.add(r2);
		gp.add(r3);
		
		p1.add(label);
		p1.add(combo, BorderLayout.CENTER);
		
		p2.add(label2);
		p2.add(r1);
		p2.add(r2);
		p2.add(r3);
		
		p3.add(label3);
		p3.add(cb);
		p3.add(cb2);
		
		this.add(p1,BorderLayout.NORTH);
		this.add(p2, BorderLayout.CENTER);
		this.add(p3, BorderLayout.SOUTH);*/
		
		/* Exercice 4 */
		
		setTitle("essai 4");
		JMenuBar menu = new JMenuBar();
		JMenu file = new JMenu("Fichier");
		JMenu Edition = new JMenu("Edition");
		JMenuItem item_new = new JMenuItem("Nouveau");
		JMenuItem item_open = new JMenuItem("Ouvrir");
		JMenuItem item_close = new JMenuItem("Fermer");
		JTextField text = new JTextField("Vive les pokemons !", 20);
		
		file.add(item_new);
		file.add(item_open);
		file.add(item_close);
		
		menu.add(file);
		menu.add(Edition);
		
		this.add(menu, BorderLayout.NORTH);
		this.add(text, BorderLayout.SOUTH);

	}
}
