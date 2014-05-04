package com.ihm;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JRadioButton;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class StudentManagementPan extends JPanel {
	private JTextField textFieldRechercherEtd;

	String [] classeGI = {"GI-1","GI-2","GI-3"};
	private JTextField rechertEtdListeText;
	private JTable rechercherTable;
	public StudentManagementPan() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel buttonPanel = new JPanel();
		add(buttonPanel, BorderLayout.NORTH);
		
		JButton bRechercher = new JButton("Rechercher");
		buttonPanel.add(bRechercher);
		
		JButton bListe = new JButton("Liste Etudiants");
		buttonPanel.add(bListe);
		
		JButton bImporter = new JButton("Importer Liste");
		buttonPanel.add(bImporter);
		
		JButton bExporter = new JButton("Exporter Liste");
		buttonPanel.add(bExporter);
		
		JPanel resultButtonPanel = new JPanel();
		add(resultButtonPanel, BorderLayout.CENTER);
		resultButtonPanel.setLayout(new BoxLayout(resultButtonPanel, BoxLayout.Y_AXIS));
		
		JPanel SearchPan = new JPanel();
		resultButtonPanel.add(SearchPan);
		GridBagLayout gbl_SearchPan = new GridBagLayout();
		gbl_SearchPan.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_SearchPan.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_SearchPan.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_SearchPan.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		SearchPan.setLayout(gbl_SearchPan);
		
		JLabel labelRechercherEtd = new JLabel("Rechercher etudiant par : ");
		GridBagConstraints gbc_labelRechercherEtd = new GridBagConstraints();
		gbc_labelRechercherEtd.anchor = GridBagConstraints.BELOW_BASELINE_LEADING;
		gbc_labelRechercherEtd.insets = new Insets(0, 0, 5, 5);
		gbc_labelRechercherEtd.gridx = 2;
		gbc_labelRechercherEtd.gridy = 2;
		SearchPan.add(labelRechercherEtd, gbc_labelRechercherEtd);
		
		JRadioButton rbNom = new JRadioButton("Nom");
		GridBagConstraints gbc_rbNom = new GridBagConstraints();
		gbc_rbNom.insets = new Insets(0, 0, 5, 5);
		gbc_rbNom.gridx = 4;
		gbc_rbNom.gridy = 2;
		SearchPan.add(rbNom, gbc_rbNom);
		
		JRadioButton rbCne = new JRadioButton("CNE");
		GridBagConstraints gbc_rbCne = new GridBagConstraints();
		gbc_rbCne.insets = new Insets(0, 0, 5, 0);
		gbc_rbCne.gridx = 5;
		gbc_rbCne.gridy = 2;
		SearchPan.add(rbCne, gbc_rbCne);
		
		textFieldRechercherEtd = new JTextField();
		GridBagConstraints gbc_textFieldRechercherEtd = new GridBagConstraints();
		gbc_textFieldRechercherEtd.anchor = GridBagConstraints.SOUTH;
		gbc_textFieldRechercherEtd.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldRechercherEtd.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldRechercherEtd.gridx = 2;
		gbc_textFieldRechercherEtd.gridy = 3;
		SearchPan.add(textFieldRechercherEtd, gbc_textFieldRechercherEtd);
		textFieldRechercherEtd.setColumns(10);
		
		JPanel listePanel = new JPanel();
		resultButtonPanel.add(listePanel);
		GridBagLayout gbl_listePanel = new GridBagLayout();
		gbl_listePanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_listePanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_listePanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_listePanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		listePanel.setLayout(gbl_listePanel);
		
		JLabel labelDepartement = new JLabel("D\u00E9partement : ");
		GridBagConstraints gbc_labelDepartement = new GridBagConstraints();
		gbc_labelDepartement.insets = new Insets(0, 0, 5, 5);
		gbc_labelDepartement.anchor = GridBagConstraints.SOUTHWEST;
		gbc_labelDepartement.gridx = 1;
		gbc_labelDepartement.gridy = 0;
		listePanel.add(labelDepartement, gbc_labelDepartement);
		
		JRadioButton rbGI = new JRadioButton("Genie informatique");
		GridBagConstraints gbc_rbGI = new GridBagConstraints();
		gbc_rbGI.anchor = GridBagConstraints.WEST;
		gbc_rbGI.insets = new Insets(0, 0, 5, 5);
		gbc_rbGI.gridx = 2;
		gbc_rbGI.gridy = 0;
		listePanel.add(rbGI, gbc_rbGI);
		
		JLabel labelClasse = new JLabel("Classe : ");
		GridBagConstraints gbc_labelClasse = new GridBagConstraints();
		gbc_labelClasse.insets = new Insets(0, 0, 5, 5);
		gbc_labelClasse.anchor = GridBagConstraints.EAST;
		gbc_labelClasse.gridx = 4;
		gbc_labelClasse.gridy = 0;
		listePanel.add(labelClasse, gbc_labelClasse);
		
		JComboBox classeComboBox = new JComboBox(classeGI);
		GridBagConstraints gbc_classeComboBox = new GridBagConstraints();
		gbc_classeComboBox.insets = new Insets(0, 0, 5, 0);
		gbc_classeComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_classeComboBox.gridx = 5;
		gbc_classeComboBox.gridy = 0;
		listePanel.add(classeComboBox, gbc_classeComboBox);
		
		JRadioButton rbGE = new JRadioButton("G\u00E9nie environnement");
		GridBagConstraints gbc_rbGE = new GridBagConstraints();
		gbc_rbGE.insets = new Insets(0, 0, 5, 5);
		gbc_rbGE.gridx = 2;
		gbc_rbGE.gridy = 1;
		listePanel.add(rbGE, gbc_rbGE);
		
		JRadioButton rbGC = new JRadioButton("G\u00E9nie civil");
		GridBagConstraints gbc_rbGC = new GridBagConstraints();
		gbc_rbGC.insets = new Insets(0, 0, 0, 5);
		gbc_rbGC.anchor = GridBagConstraints.WEST;
		gbc_rbGC.gridx = 2;
		gbc_rbGC.gridy = 2;
		listePanel.add(rbGC, gbc_rbGC);
		
		JPanel impoterListePanel = new JPanel();
		resultButtonPanel.add(impoterListePanel);
		GridBagLayout gbl_impoterListePanel = new GridBagLayout();
		gbl_impoterListePanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_impoterListePanel.rowHeights = new int[]{0, 0};
		gbl_impoterListePanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_impoterListePanel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		impoterListePanel.setLayout(gbl_impoterListePanel);
		
		JLabel lblImpoterUneListe = new JLabel("Impoter une liste des etudiants ");
		GridBagConstraints gbc_lblImpoterUneListe = new GridBagConstraints();
		gbc_lblImpoterUneListe.insets = new Insets(0, 0, 0, 5);
		gbc_lblImpoterUneListe.gridx = 5;
		gbc_lblImpoterUneListe.gridy = 0;
		impoterListePanel.add(lblImpoterUneListe, gbc_lblImpoterUneListe);
		
		JButton bImporterListeEtd = new JButton("...");
		GridBagConstraints gbc_bImporterListeEtd = new GridBagConstraints();
		gbc_bImporterListeEtd.gridx = 6;
		gbc_bImporterListeEtd.gridy = 0;
		impoterListePanel.add(bImporterListeEtd, gbc_bImporterListeEtd);
		
		JPanel exporterListePanel = new JPanel();
		resultButtonPanel.add(exporterListePanel);
		GridBagLayout gbl_exporterListePanel = new GridBagLayout();
		gbl_exporterListePanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_exporterListePanel.rowHeights = new int[]{0, 0};
		gbl_exporterListePanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_exporterListePanel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		exporterListePanel.setLayout(gbl_exporterListePanel);
		
		JLabel lblExporterUneListe = new JLabel("Exporter une liste des etudiants");
		GridBagConstraints gbc_lblExporterUneListe = new GridBagConstraints();
		gbc_lblExporterUneListe.insets = new Insets(0, 0, 0, 5);
		gbc_lblExporterUneListe.gridx = 5;
		gbc_lblExporterUneListe.gridy = 0;
		exporterListePanel.add(lblExporterUneListe, gbc_lblExporterUneListe);
		
		JButton bExporterListeEtd = new JButton("...");
		GridBagConstraints gbc_bExporterListeEtd = new GridBagConstraints();
		gbc_bExporterListeEtd.gridx = 6;
		gbc_bExporterListeEtd.gridy = 0;
		exporterListePanel.add(bExporterListeEtd, gbc_bExporterListeEtd);
		
		JPanel listeEtdPanel = new JPanel();
		resultButtonPanel.add(listeEtdPanel);
		GridBagLayout gbl_listeEtdPanel = new GridBagLayout();
		gbl_listeEtdPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_listeEtdPanel.rowHeights = new int[]{0, 0};
		gbl_listeEtdPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_listeEtdPanel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		listeEtdPanel.setLayout(gbl_listeEtdPanel);
		
		JLabel lblRchercherEtudiant = new JLabel("Rchercher etudiant");
		GridBagConstraints gbc_lblRchercherEtudiant = new GridBagConstraints();
		gbc_lblRchercherEtudiant.insets = new Insets(0, 0, 0, 5);
		gbc_lblRchercherEtudiant.anchor = GridBagConstraints.EAST;
		gbc_lblRchercherEtudiant.gridx = 3;
		gbc_lblRchercherEtudiant.gridy = 0;
		listeEtdPanel.add(lblRchercherEtudiant, gbc_lblRchercherEtudiant);
		
		rechertEtdListeText = new JTextField();
		GridBagConstraints gbc_rechertEtdListeText = new GridBagConstraints();
		gbc_rechertEtdListeText.fill = GridBagConstraints.HORIZONTAL;
		gbc_rechertEtdListeText.gridx = 4;
		gbc_rechertEtdListeText.gridy = 0;
		listeEtdPanel.add(rechertEtdListeText, gbc_rechertEtdListeText);
		rechertEtdListeText.setColumns(10);
		
		rechercherTable = new JTable();
		resultButtonPanel.add(rechercherTable);
		


	}
//	public static void main(String[] args) {
//		JFrame jfr = new JFrame();
//		jfr.setDefaultCloseOperation(jfr.EXIT_ON_CLOSE);
//		jfr.getContentPane().add(new StudentManagementPan());
//		jfr.pack();
//		jfr.setVisible(true);
//	}

}
