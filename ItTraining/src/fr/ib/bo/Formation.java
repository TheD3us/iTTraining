package fr.ib.bo;

import java.time.LocalDate;

public class Formation {
	
		private int id;
		private String nom;
		private String prenom;		
		private LocalDate dateDebut;
		private LocalDate dateDefin;
		private String niveau;
		private Test test;
		private Apprenant apprenant;
		private Salle salle;
		private Formateur formateur;
		//private Theme theme;
		//private SousTheme soustheme;
		
		// Constructeur
		
public Formation ()	{
	super ();
}
	
	public Formation(int id, String nom, String prenom,LocalDate dateDebut, LocalDate dateDefin, String niveau, Test test, Apprenant apprenant,
			Salle salle, Formateur formateur) {
	
			this.nom = nom;
			this.prenom = prenom;
			this.dateDebut = dateDebut;
			this.dateDefin = dateDefin;
			this.niveau = niveau;
			this.test = test;
			this.apprenant = apprenant;
			this.salle = salle;
			this.formateur = formateur;
<<<<<<< HEAD
			this.theme = theme; 
			this.soustheme = soustheme;
=======
			//this.theme = theme 
			//this.soustheme = soustheme;
>>>>>>> 0c07c109345c8c1351f8c105285addcf23da6870
						
		
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDteDebut() {
		return dateDebut;
	}

	public void setDteDebut(LocalDate dteDebut) {
		this.dateDebut = dteDebut;
	}

	public LocalDate getDteDefin() {
		return dateDefin;
	}

	public void setDteDefin(LocalDate dteDefin) {
		this.dateDefin = dteDefin;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public Apprenant getApprenant() {
		return apprenant;
	}

	public void setApprenant(Apprenant apprenant) {
		this.apprenant = apprenant;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Formateur getFormateur() {
		return formateur;
	}

	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

	
	
	
	

}

