package fr.ib.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ib.bll.MachineBll;
import fr.ib.bo.Machine;

@RestController
@RequestMapping("/machine")
public class MachineController {
	@Autowired
	private MachineBll bll;
	
	@GetMapping
	public ResponseEntity<List<Machine>> findAll() {
		return new ResponseEntity<List<Machine>>(bll.selectAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Machine> findById(@PathVariable("id") int id) {
		if (bll.exist(id)) {
			return new ResponseEntity<Machine>(bll.selectById(id), HttpStatus.OK);
		} else {
			return new ResponseEntity<Machine>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public ResponseEntity<Machine> insert(@RequestBody Machine machine) {
		try {
			bll.insert(machine);
			return new ResponseEntity<Machine>(machine, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Machine>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Machine> update(
											@PathVariable("id") int id,
											@RequestBody Machine machine) {
		try {
			// Je recupere l'instance telle qu'elle existe en bdd
			Machine originalBDD = bll.selectById(id);
			
			originalBDD.setCodeIdentification(machine.getCodeIdentification());
			originalBDD.setMarque(machine.getMarque());
			originalBDD.setModele(machine.getModele());
			originalBDD.setApprenant(machine.getApprenant());
			
			bll.update(originalBDD);
			return new ResponseEntity<Machine>(machine, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Machine>(HttpStatus.CONFLICT);
		}
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		try {
			bll.delete(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
}
