package com.ihm;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class header extends JPanel{
public static	JPanel paneau = new JPanel();
	JLabel deconnexion = new JLabel("deconnexion");
	
public header() {
add(paneau);
paneau.add(deconnexion);
}
}
