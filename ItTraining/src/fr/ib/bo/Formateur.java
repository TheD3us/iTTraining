package fr.ib.bo;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
@DiscriminatorValue(value="F")
public class Formateur extends Personne {
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name="module")
	@JsonIgnore
	private List<Module> module;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="machine")
	private Machine machine;
	
	
	// Constructeurs 
	public Formateur() {
		super();
	}

	
	
	// Getters and Setters
	


	public Machine getMachine() {
		return machine;
	}

	public List<Module> getModule() {
		return module;
	}

	public void setModule(List<Module> module) {
		this.module = module;
	}

	public void setMachine(Machine machine) {
		this.machine = machine;
	}

}
