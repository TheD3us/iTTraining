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

import fr.ib.bll.FormateurBll;
import fr.ib.bo.Formateur;



@RestController
@RequestMapping("/formateur")
public class FormateurController {
	@Autowired
	private FormateurBll bll;
	
	@GetMapping
	public ResponseEntity<List<Formateur>> findAll() {
		return new ResponseEntity<List<Formateur>>(bll.selectAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Formateur> findById(@PathVariable("id") int id) {
		if (bll.exist(id)) {
			return new ResponseEntity<Formateur>(bll.selectById(id), HttpStatus.OK);
		} else {
			return new ResponseEntity<Formateur>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public ResponseEntity<Formateur> insert(@RequestBody Formateur formateur) {
		try {
			bll.insert(formateur);
			return new ResponseEntity<Formateur>(formateur, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Formateur>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Formateur> update(
											@PathVariable("id") int id,
											@RequestBody Formateur formateur) {
		try {
			// Je recupere l'instance telle qu'elle existe en bdd
			Formateur originalBDD = bll.selectById(id);
			
			originalBDD.setNom(formateur.getNom());
			originalBDD.setPrenom(formateur.getPrenom());
			originalBDD.setAdresse(formateur.getAdresse());
			originalBDD.setMail(formateur.getMail());
			originalBDD.setNumTelephone(formateur.getNumTelephone());
			originalBDD.setMotDePasse(formateur.getMotDePasse());
			originalBDD.setRole(formateur.getRole());
			originalBDD.setModule(formateur.getModule());
			originalBDD.setMachine(formateur.getMachine());
			


			
			bll.update(originalBDD);
			return new ResponseEntity<Formateur>(formateur, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Formateur>(HttpStatus.CONFLICT);
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
