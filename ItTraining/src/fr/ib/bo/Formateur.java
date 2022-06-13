package fr.ib.bo;

public class Formateur {
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
	
}
