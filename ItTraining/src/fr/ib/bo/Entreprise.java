package fr.ib.bo;

public class Entreprise {
	private int id;
	private String nom;
	private String siret;
	private Adresse adresse;
	
	
	
	//Constructeur
	
	public Entreprise() {
		super();
	}

	public Entreprise(int id, String nom, String siret, Adresse adresse) {
		super();
		this.id = id;
		this.nom = nom;
		this.siret = siret;
		this.adresse = adresse;
	}
	
	
	// Getters & Setters 
	
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

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
}
