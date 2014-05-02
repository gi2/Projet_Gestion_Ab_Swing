package com.ihm;

import java.awt.BorderLayout;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class Panmenu extends JMenuBar {

 
 public JPanel pan = new JPanel();
	// Barre de menu
	private JMenuBar menuBar = new JMenuBar();

	// Menu fichier
	private JMenu menuFichier = new JMenu("Fichier");

	// Menu Edition
	private JMenu menuEdition = new JMenu("Edition");

	// Menu Aide
	private JMenu menuAide = new JMenu("Aide");

	// élément de menu ouvrir
	private JMenuItem ouvrirItem = new JMenuItem("Ouvrir");

	// élément de menu ouvrir
	private JMenuItem fermerItem = new JMenuItem("Fermer");

	// élément de menu ouvrir
	private JMenuItem copierItem = new JMenuItem("Copier");

	// élément de menu ouvrir
	private JMenuItem collerItem = new JMenuItem("Coller");

	
	public Panmenu() {

add(menuBar);	 
		menuBar.add(menuFichier);
		menuBar.add(menuEdition);
		menuBar.add(menuAide);

		 
		
		 

		menuFichier.add(ouvrirItem);
		menuFichier.add(fermerItem);
 
//	 setJMenuBar(menuBar);
//		 pan.add(menuBar);
	}

 
}
