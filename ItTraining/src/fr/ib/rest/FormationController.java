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

import fr.ib.bll.FormationBll;
import fr.ib.bo.Formation;

@RestController
@RequestMapping("/formation")
public class FormationController {
	@Autowired
	private FormationBll bll;
	
	@GetMapping
	public ResponseEntity<List<Formation>> findAll() {
		List<Formation> forms = bll.selectAll();
		return new ResponseEntity<List<Formation>>(forms, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Formation> findById(@PathVariable("id") int id) {
		if (bll.exist(id)) {
			return new ResponseEntity<Formation>(bll.selectById(id), HttpStatus.OK);
		} else {
			return new ResponseEntity<Formation>(HttpStatus.NOT_FOUND);
		}
	
	}

	@PostMapping
	public ResponseEntity<Formation> insert(@RequestBody Formation formation) {
		try {
			bll.insert(formation);
			return new ResponseEntity<Formation>(formation, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Formation>(HttpStatus.CONFLICT);
		}
	}
	@PutMapping(value = "/{id}")
	public ResponseEntity<Formation> update(
											@PathVariable("id") int id,
											@RequestBody Formation formation) {

		try {
			// Je recupere l'instance telle qu'elle existe en bdd
			Formation originalBDD = bll.selectById(id);
			
			originalBDD.setNom(formation.getNom());
			originalBDD.setModule(formation.getModule());
			originalBDD.setNiveau(formation.getNiveau());
			originalBDD.setTest(formation.getTest());
			originalBDD.setApprenant(formation.getApprenant());
			originalBDD.setSalle(formation.getSalle());
			originalBDD.setFormateur(formation.getFormateur());
			originalBDD.setDteDebut(formation.getDteDebut());
			originalBDD.setDteDefin(formation.getDteDefin());
			
			bll.update(originalBDD);
			return new ResponseEntity<Formation>(formation, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Formation>(HttpStatus.CONFLICT);
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


