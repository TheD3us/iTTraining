package fr.ib.bo;

<<<<<<< HEAD
import javax.persistence.Entity;

@Entity
=======
<<<<<<< HEAD
>>>>>>> b2c4af43003a00ab05ea7c19ec3265d3833812b0
public class Apprenant {

=======
public class Apprenant extends Personne {
	private boolean candidatAccepte;
	private Formation formation;
	private Machine machine;
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
	
	
	
>>>>>>> efcd23d1b553493798e3b7b2e76a6d258e0776c9
}
