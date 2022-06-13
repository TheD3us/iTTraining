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

import fr.ib.bll.SalleBll;
import fr.ib.bo.Salle;

@RestController
@RequestMapping("/salle")
public class SalleController {
	@Autowired 
	private  SalleBll bll;
	
	@GetMapping
	public ResponseEntity<List<Salle>> findAll() {
		return new ResponseEntity<List<Salle>>(bll.selectAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Salle> findById(@PathVariable("id") int id) {
		if (bll.exist(id)) {
			return new ResponseEntity<Salle>(bll.selectById(id), HttpStatus.OK);
		} else {
			return new ResponseEntity<Salle>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public ResponseEntity<Salle> insert(@RequestBody Salle salle) {
		try {
			bll.insert(salle);
			return new ResponseEntity<Salle>(salle, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Salle>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Salle> update(
											@PathVariable("id") int id,
											@RequestBody Salle salle) {
		try {
			// Je recupere l'instance telle qu'elle existe en bdd
			Salle originalBDD = bll.selectById(id);
			
			originalBDD.setAdresse(salle.getAdresse());
			originalBDD.setNomSalle(salle.getNomSalle());
			originalBDD.setMachines(salle.getMachines());
			
			bll.update(originalBDD);
			return new ResponseEntity<Salle>(salle, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Salle>(HttpStatus.CONFLICT);
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
