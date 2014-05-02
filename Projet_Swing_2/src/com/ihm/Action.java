package com.ihm;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Action extends JFrame implements ActionListener {
	public static JFrame fenetre;
	public Action(JFrame obj) {
		 fenetre = obj;
	}

	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
	
	if (source == HomeInterface.bEntrer  ) {

				  Change.changeCenter(new ChoiceInterface(),fenetre);
				  Change.changeHeader(new Panmenu(),fenetre);
				  Change.changeHeader1(fenetre );

			} 
 				
//				if (source == buttonPrecedent)
//					stack.previous(imagePanel);
//				if (source == buttonSuivant)
//					stack.next(imagePanel);
				

	}
//
//	private    void changeHeader1( ) {
//		  remove(ChoiceInterface.p12);
//  		ChoiceInterface.p1.add(ChoiceInterface.dec, BorderLayout.EAST);
// 		 
//  		 add(ChoiceInterface.p12);
// 		 validate();
//	
//		
//	}
//
//
//	private     void changeHeader(Panmenu panmenu) {
//// 		remove(p11);
////  		p11 = panmenu.pan;
//		fenetre.setJMenuBar(panmenu);
//		
////		add(p1);
//		fenetre.validate();
//		
//	}
//
//
//	private void changeCenter(JPanel newPan) {
//	 
//		fenetre.remove(ChoiceInterface.p2);
//		fenetre.p2 = newPan;
//		fenetre.add(ChoiceInterface.p2);
//		 fenetre.validate();
//
//	}
}
