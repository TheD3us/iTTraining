package fr.ib.bo;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import javax.persistence.OneToOne;




@Entity
@DiscriminatorValue(value="F")
public class Formateur extends Personne {
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name="module")
	private List<Module> module;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="machine")
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
