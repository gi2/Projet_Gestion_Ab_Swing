package com.ihm;
//zid hadi alah idiik
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ChoiceInterface  extends JPanel implements MouseListener{
	ImageIcon one = new ImageIcon("images/etu.jpg");
	ImageIcon one1 = new ImageIcon("images/etu1.jpg");
	ImageIcon tow = new ImageIcon("images/avant.png");
	ImageIcon tow1 = new ImageIcon("images/apres.png");
	ImageIcon tree = new ImageIcon("images/stat.jpg");
	ImageIcon tree1 = new ImageIcon("images/stat1.png");
	ImageIcon four = new ImageIcon("images/set.png");
	ImageIcon four1 = new ImageIcon("images/set1.png");
	 
	private JPanel contentPane;
	 JLabel gestion_etudiant = new JLabel(one);
	JLabel lblGestionDabsence = new JLabel(tow);
	JLabel lblStatistiques = new JLabel(tree);
	JLabel lblGestionDeCompte = new JLabel(four);
	JLabel titre = new JLabel( );
	
	public ChoiceInterface() {
		 
  
		 
		JPanel center = new JPanel();
		add(center, BorderLayout.CENTER);
		GridBagLayout gbl_center = new GridBagLayout();
//		gbl_center.columnWidths = new int[] {30, 30, 30, 30, 30, 30, 30, 0, 0, 0};
//		gbl_center.rowHeights = new int[] {30, 30, 30, 30, 30, 30, 0, 0, 0};
//		gbl_center.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
//		gbl_center.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
//		 
		center.setLayout(gbl_center);
		
		
		
		titre.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		GridBagConstraints gbc_titre = new GridBagConstraints();
		gbc_titre.insets = new Insets(0, 0, 5, 5);
		gbc_titre.gridx = 7;
		gbc_titre.gridy = 8;
		center.add(titre, gbc_titre);
		
		
		
		
		
		
		
		
		
		gestion_etudiant.addMouseListener(this);
//		JLabel gestion_etudiant = new JLabel(one);
		GridBagConstraints gbc_gestion_etudiant = new GridBagConstraints();
		gbc_gestion_etudiant.insets = new Insets(0, 0, 5, 5);
		gbc_gestion_etudiant.gridx = 7;
		gbc_gestion_etudiant.gridy = 6;
		gbc_gestion_etudiant.gridwidth = 1;
//		gbc_gestion_etudiant.fill = GridBagConstraints.BOTH;
		center.add(gestion_etudiant, gbc_gestion_etudiant);
		
		lblGestionDabsence.addMouseListener(this);
//		JLabel lblGestionDabsence = new JLabel(tow);
		GridBagConstraints gbc_lblGestionDabsence = new GridBagConstraints();
		gbc_lblGestionDabsence.insets = new Insets(0, 0, 5, 0);
		gbc_lblGestionDabsence.gridx = 8;
		gbc_lblGestionDabsence.gridy = 6;
		gbc_lblGestionDabsence.gridwidth = 1;
//		 gbc_lblGestionDabsence.fill = GridBagConstraints.BOTH;
		center.add(lblGestionDabsence, gbc_lblGestionDabsence);
		
		lblStatistiques.addMouseListener(this);
//		JLabel lblStatistiques = new JLabel(tree);
		GridBagConstraints gbc_lblStatistiques = new GridBagConstraints();
		gbc_lblStatistiques.insets = new Insets(0, 0, 0, 5);
		gbc_lblStatistiques.gridx = 7;
		gbc_lblStatistiques.gridy = 7;
		gbc_lblStatistiques.gridwidth =1;
//		gbc_lblStatistiques.fill = GridBagConstraints.BOTH;
		
		center.add(lblStatistiques, gbc_lblStatistiques);
		
		lblGestionDeCompte.addMouseListener(this);
//		JLabel lblGestionDeCompte = new JLabel(four);
		GridBagConstraints gbc_lblGestionDeCompte = new GridBagConstraints();
		gbc_lblGestionDeCompte.gridx = 8;
		gbc_lblGestionDeCompte.gridy = 7;
		gbc_lblGestionDeCompte.gridwidth = 1;
//		gbc_lblGestionDeCompte.fill = GridBagConstraints.BOTH;
		center.add(lblGestionDeCompte, gbc_lblGestionDeCompte);
		
	 
	
	
	}

	 
	public void mouseClicked(MouseEvent e) {
		
	JLabel lab = (JLabel) e.getSource();
		
		if( lab == gestion_etudiant )  {
 		gestion_etudiant.setIcon(one1); 
		titre.setText("Gestion des étudiants");
		}
		if( lab == lblGestionDabsence )  {
			lblGestionDabsence.setIcon(tow1); 
			titre.setText("Gestion d'absence ");
		}
		if( lab == lblStatistiques )  {
			lblStatistiques.setIcon(tree1); 
			titre.setText("Statistiques ");
		}
		if( lab == lblGestionDeCompte )  {
			lblGestionDeCompte.setIcon(four1);
			titre.setText("Paramètres ");
		}
	}
	 
	public void mouseEntered(MouseEvent e) {
		JLabel lab = (JLabel) e.getSource();
		
		if( lab == gestion_etudiant )  {
 		gestion_etudiant.setIcon(one1); 
		titre.setText("Gestion des étudiants");
		}
		if( lab == lblGestionDabsence )  {
			lblGestionDabsence.setIcon(tow1); 
			titre.setText("Gestion d'absence ");
		}
		if( lab == lblStatistiques )  {
			lblStatistiques.setIcon(tree1); 
			titre.setText("Statistiques ");
		}
		if( lab == lblGestionDeCompte )  {
			lblGestionDeCompte.setIcon(four1);
			titre.setText("Paramètres ");
		}
	}
	 
	public void mouseExited(MouseEvent e) {
JLabel lab = (JLabel) e.getSource();
		
		if( lab == gestion_etudiant )  
 		gestion_etudiant.setIcon(one); 
		
		if( lab == lblGestionDabsence )  
			lblGestionDabsence.setIcon(tow); 
		
		if( lab == lblStatistiques )  
			lblStatistiques.setIcon(tree); 
		
		if( lab == lblGestionDeCompte )  
			lblGestionDeCompte.setIcon(four); 
		titre.setText(" ");
	}
	 
	public void mousePressed(MouseEvent e) {
	 
		
	}
	 
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
