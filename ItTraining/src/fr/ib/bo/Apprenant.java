package fr.ib.bo;


import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue(value="A")
public class Apprenant extends Personne {
	private boolean candidatAccepte;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="formation")
	private Formation formation;
	
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

	public Apprenant(boolean candidatAccepte, Formation formation, Machine machine, Entreprise entreprise) {
		super();
		this.candidatAccepte = candidatAccepte;
		this.formation = formation;
		this.machine = machine;
		this.entreprise = entreprise;
	}

	public boolean isCandidatAccepte() {
		return candidatAccepte;
	}

	public void setCandidatAccepte(boolean candidatAccepte) {
		this.candidatAccepte = candidatAccepte;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
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
