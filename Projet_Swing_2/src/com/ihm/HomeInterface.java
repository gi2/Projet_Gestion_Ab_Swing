package com.ihm;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;

public class HomeInterface extends JFrame  {
	private static int ID;	 
	public static JPanel imagePanel, p1,p2, p11, p12,  p21, p22, p3, pan;
	public static JButton bEntrer = new JButton("Entrer");
	public static JButton buttonPrecedent = new JButton("<");
	public static JButton buttonSuivant = new JButton(">");
	public static JButton buttonStart = new JButton("Début");
	public static JButton buttonEnd = new JButton("Fin");
	public static JPasswordField passText = new JPasswordField();
	public static CardLayout stack;
	JLabel signature = new JLabel("Copyright © 2014 - All rights reserved"),
			appText;

	
	
	public static  JLabel deconnexion = new JLabel("deconnexion");
	public static	JPanel dec = new JPanel();
	
	public HomeInterface() {
		ID=2;
		this.setTitle("");
		Dimension dim = getDimScreen();
		setSize(dim.width -(dim.width)/3 -(dim.width)/7 , dim.height - dim.height / 4 + (dim.height / 10));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		
		dec.add(deconnexion);
		// paneau d'entete
		p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		p1.setBorder(BorderFactory.createMatteBorder(1, 1, 2, 1, Color.BLACK));

		// panneau sur le panneau d'entete
		p11 = new JPanel();
		p1.add(p11, BorderLayout.WEST);
		ImageIcon icone = new ImageIcon("./images/logoensah2.png");
		JLabel image = new JLabel(icone);
		p11.add(image);

		p12 = new JPanel();
		p1.add(p12, BorderLayout.EAST);

		JLabel loginLabel = new JLabel("Identitée : ");
		JTextField loginText = new JTextField(10);
		loginText.setBackground(Color.gray);
		loginText.setText("login");

		JLabel passLabel = new JLabel("mot de passe : ");
		passText = new JPasswordField(10);
		passText.setBackground(Color.gray);
		passText.setText("***********");

		bEntrer.setPreferredSize(new Dimension(69, 20));

		p12.add(loginLabel);
		p12.add(loginText);
		p12.add(passLabel);
		p12.add(passText);
		p12.add(bEntrer);

		// deusième panneau avec comme Layout manager GridBagLayout
		p2 = new JPanel();
		p2.setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(1, 1, 1, 1);

		Marquee policePanel = new Marquee(
				"    Gestion d'abscence et des étudiants ENSAH ");
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		gbc.gridheight = 1;
		p2.add(policePanel, gbc);

		// p21 = new JPanel();
		// p21.setLayout(new GridBagLayout());

		// Création des labels contenant les images
		JLabel labIm1 = new JLabel(new ImageIcon("./images/ensa2.jpg"));
		JLabel labIm2 = new JLabel(new ImageIcon("./images/ensa1.jpg.png"));
		JLabel labIm3 = new JLabel(new ImageIcon("./images/ensa2.jpg.png"));

		// Création des paneau
		JPanel imagePanel = new JPanel();
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridwidth = 5;
		gbc.gridheight = 5;
		p2.add(imagePanel, gbc);

		// JPanel buttonPanel = new JPanel();

		// Associer un cardlayout au paneau imagePanel
		CardLayout stack = new CardLayout();
		imagePanel.setLayout(stack);

		// ajouter les labels dans le paneau imagePanel
		imagePanel.add(labIm1, "img1");
		imagePanel.add(labIm2, "img2");
		imagePanel.add(labIm3, "img3");

		// Ajout de l'écouteur sur les boutons
//		buttonPrecedent.addActionListener(new Action());
//		buttonSuivant.addActionListener(new Action());
//		buttonStart.addActionListener(new Action());
//		buttonEnd.addActionListener(new Action());

		// Ajouter les boutons dans le paneau buttonPanel

		gbc.gridx = 7;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 5;
		p2.add(buttonSuivant, gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 5;
		p2.add(buttonPrecedent, gbc);

		// Ajouter les paneau dans la fenetre
		// p21.add(imagePanel, BorderLayout.CENTER);
		// p21.add(buttonPanel, BorderLayout.SOUTH);

		// JPanel p21 = new JPanel();
		// gbc.gridx = 0;
		// gbc.gridy = 0;
		// gbc.gridwidth = 4;
		// gbc.gridheight = 4;
		// p2.add(p21, gbc);

		appText = new JLabel("<html><h2>presentation:</h2>"
				+ "<p>cete hjgsqds kqgd qsd gdskdgsqkdkh d kdhgk</p>" + "<ul>"
				+ "	<li>kahhh jjahhh </li>" + "<li>kahhh jjahhh </li>"
				+ "<li>kahhh jjahhh </li>" + "<li>kahhh jjahhh </li>"
				+ "<li>kahhh jjahhh </li> </html>");

		gbc.gridx = 8;
		gbc.gridy = 1;
		gbc.gridwidth = 5;
		gbc.gridheight = 5;
		p2.add(appText, gbc);

		p3 = new JPanel();
		p3.setBackground(Color.white);
		p3.add(signature);

		this.add(p1, BorderLayout.NORTH);
		this.add(p2, BorderLayout.CENTER);
		this.add(p3, BorderLayout.SOUTH);
		bEntrer.addActionListener(new Action(this));
		 
		this.setVisible(true);
	}

	public static void main(String[] args) {
		       HomeInterface obj1 = new HomeInterface();
	}

	public static Dimension getDimScreen() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		return tk.getScreenSize();

	}

//	public void actionPerformed(ActionEvent e) {
//		JButton source = (JButton) e.getSource();
//	
//	if (source == bEntrer  ) {
//
//				changeCenter(new home2());
//				changeHeader(new Panmenu());
//				changeHeader1( );
//
//			} 
//				 
//				
//				if (source == buttonPrecedent)
//					stack.previous(imagePanel);
//				if (source == buttonSuivant)
//					stack.next(imagePanel);
//				
//
//	}

//	private void changeHeader1( ) {
//  		remove(p12);
//  		p1.add(dec, BorderLayout.EAST);
// 		 
// 		add(p12);
//  validate();
//	
//		
//	}
//
//	private void changeHeader(Panmenu panmenu) {
//// 		remove(p11);
////  		p11 = panmenu.pan;
//		setJMenuBar(panmenu);
//		
////		add(p1);
//		validate();
//		
//	}
//
//	private void changeCenter(JPanel newPan) {
//
//		remove(p2);
//		p2 = newPan;
//		add(p2);
//		validate();
//
//	}

}
