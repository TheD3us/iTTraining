package fr.ib.bo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Formation {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;

		private String nom;

		private LocalDate dateDebut;
		private LocalDate dateDefin;
		private String niveau;
		
		@OneToOne(cascade = CascadeType.PERSIST)
		@JoinColumn(name="test")
		private Test test;
		
		@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
		@Fetch(value = FetchMode.SUBSELECT)
		private List<Module> module = new ArrayList<Module>();
		
		@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
		@Fetch(value = FetchMode.SUBSELECT)
		private List<Apprenant> apprenant = new ArrayList<Apprenant>();
		
		@OneToOne(cascade = CascadeType.PERSIST)
		@JoinColumn(name="salle")
		private Salle salle;
		
		@OneToOne(cascade = CascadeType.PERSIST)
		@JoinColumn(name="formateur")
		private Formateur formateur;
		//private Theme theme;
		//private SousTheme soustheme;
		
		// Constructeur
		
public Formation ()	{
	super ();
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
	
	
	public List<Module> getModule() {
		return module;
	}



	public void setModule(List<Module> module) {
		this.module = module;
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



	public List<Apprenant> getApprenant() {
		return apprenant;
	}


	public void setApprenant(List<Apprenant> apprenant) {
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

