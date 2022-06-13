package fr.ib.bo;

<<<<<<< HEAD
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
