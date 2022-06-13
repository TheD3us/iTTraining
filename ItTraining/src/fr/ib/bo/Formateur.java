package fr.ib.bo;

<<<<<<< HEAD
import javax.persistence.Entity;


public class Formateur {

=======
public class Formateur extends Personne {
	private Module module;
	private Machine machine;
	
	
	// Constructeurs 
	public Formateur() {
		super();
	}

	public Formateur(Module module, Machine machine) {
		super();
		this.module = module;
		this.machine = machine;
	}
	
	
	// Getters and Setters
	
	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public Machine getMachine() {
		return machine;
	}

	public void setMachine(Machine machine) {
		this.machine = machine;
	}
	
>>>>>>> efcd23d1b553493798e3b7b2e76a6d258e0776c9
}
