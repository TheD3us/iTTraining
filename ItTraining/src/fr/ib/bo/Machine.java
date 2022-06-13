package fr.ib.bo;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Machine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int codeIdentification;
	private String marque;
	private String modele;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="apprenant")
	private Apprenant apprenant;
	
	//Constructeurs
	
	public Machine() {
		super();
	}

	public Machine(int id, int codeIdentification, String marque, String modele, Apprenant apprenant) {
		super();
		this.id = id;
		this.codeIdentification = codeIdentification;
		this.marque = marque;
		this.modele = modele;
		this.apprenant = apprenant;
		
	}

	//Get & Set
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodeIdentification() {
		return codeIdentification;
	}

	public void setCodeIdentification(int codeIdentification) {
		this.codeIdentification = codeIdentification;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public Apprenant getApprenant() {
		return apprenant;
	}

	public void setApprenant(Apprenant apprenant) {
		this.apprenant = apprenant;
	}

}
