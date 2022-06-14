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

import fr.ib.bll.ApprenantBll;
import fr.ib.bo.Apprenant;



@RestController
@RequestMapping("/apprenant")
public class ApprenantController {
	@Autowired
	private ApprenantBll bll;
	
	@GetMapping
	public ResponseEntity<List<Apprenant>> findAll() {
		return new ResponseEntity<List<Apprenant>>(bll.selectAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Apprenant> findById(@PathVariable("id") int id) {
		if (bll.exist(id)) {
			return new ResponseEntity<Apprenant>(bll.selectById(id), HttpStatus.OK);
		} else {
			return new ResponseEntity<Apprenant>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public ResponseEntity<Apprenant> insert(@RequestBody Apprenant apprenant) {
		try {
			bll.insert(apprenant);
			return new ResponseEntity<Apprenant>(apprenant, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Apprenant>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Apprenant> update(
											@PathVariable("id") int id,
											@RequestBody Apprenant apprenant) {
		try {
			// Je recupere l'instance telle qu'elle existe en bdd
			Apprenant originalBDD = bll.selectById(id);
			
			originalBDD.setNom(apprenant.getNom());
			originalBDD.setPrenom(apprenant.getPrenom());
			originalBDD.setAdresse(apprenant.getAdresse());
			originalBDD.setMail(apprenant.getMail());
			originalBDD.setNumTelephone(apprenant.getNumTelephone());
			originalBDD.setMotDePasse(apprenant.getMotDePasse());
			originalBDD.setRole(apprenant.getRole());
			originalBDD.setCandidatAccepte(apprenant.isCandidatAccepte());
			originalBDD.setFormation(apprenant.getFormation());
			originalBDD.setEntreprise(apprenant.getEntreprise());
			originalBDD.setMachine(apprenant.getMachine());
			


			
			bll.update(originalBDD);
			return new ResponseEntity<Apprenant>(apprenant, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Apprenant>(HttpStatus.CONFLICT);
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
