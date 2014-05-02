package com.ihm;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Change   {

	 
	
	
	public static void changeHeader1(JFrame fenetre) {
		HomeInterface.p1.remove(HomeInterface.p12);
		 HomeInterface.p12=HomeInterface.dec;
		 HomeInterface.p1.add(HomeInterface.p12);
  		fenetre.validate();	
	}

	 


	public static   void changeHeader(Panmenu panmenu, JFrame fenetre) {
 
		fenetre.setJMenuBar(panmenu);
 
		fenetre.validate();
		
	}

	public static void changeCenter(JPanel newPan, JFrame fenetre) {
	 
		fenetre.remove(HomeInterface.p2);
		HomeInterface.p2=newPan;
		fenetre.add(HomeInterface.p2);
		fenetre.validate();

	}

 
	   
}
