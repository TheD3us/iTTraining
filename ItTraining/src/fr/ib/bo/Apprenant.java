package fr.ib.bo;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@DiscriminatorValue(value="A")
public class Apprenant extends Personne {
	private boolean candidatAccepte;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name="formation")
	@JsonIgnore
	private List<Formation> formation;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="machine")
	private Machine machine;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="entreprise")
	private Entreprise entreprise;
	
	
	//Construsteurs
	public Apprenant() {
		super();
	}



	public boolean isCandidatAccepte() {
		return candidatAccepte;
	}

	public void setCandidatAccepte(boolean candidatAccepte) {
		this.candidatAccepte = candidatAccepte;
	}

	

	public List<Formation> getFormation() {
		return formation;
	}



	public void setFormation(List<Formation> formation) {
		this.formation = formation;
	}



	public Machine getMachine() {
		return machine;
	}

	public void setMachine(Machine machine) {
		this.machine = machine;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	
	
	//Getters & Setters 

}
