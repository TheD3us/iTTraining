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

import fr.ib.bll.AdresseBll;
import fr.ib.bo.Adresse;



@RestController
@RequestMapping("/adresse")
public class AdresseController {
	@Autowired
	private AdresseBll bll;
	
	@GetMapping
	public ResponseEntity<List<Adresse>> findAll() {
		return new ResponseEntity<List<Adresse>>(bll.selectAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Adresse> findById(@PathVariable("id") int id) {
		if (bll.exist(id)) {
			return new ResponseEntity<Adresse>(bll.selectById(id), HttpStatus.OK);
		} else {
			return new ResponseEntity<Adresse>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public ResponseEntity<Adresse> insert(@RequestBody Adresse adresse) {
		try {
			bll.insert(adresse);
			return new ResponseEntity<Adresse>(adresse, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Adresse>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Adresse> update(
											@PathVariable("id") int id,
											@RequestBody Adresse adresse) {
		try {
			// Je recupere l'instance telle qu'elle existe en bdd
			Adresse originalBDD = bll.selectById(id);
			
			originalBDD.setAppartement(adresse.getAppartement());
			originalBDD.setNoRue(adresse.getNoRue());
			originalBDD.setComplement(adresse.getComplement());
			originalBDD.setTypeVoie(adresse.getTypeVoie());
			originalBDD.setNomVoie(adresse.getNomVoie());
			originalBDD.setCpo(adresse.getCpo());
			originalBDD.setVille(adresse.getVille());
			originalBDD.setAppartement(adresse.getAppartement());
			


			
			bll.update(originalBDD);
			return new ResponseEntity<Adresse>(adresse, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Adresse>(HttpStatus.CONFLICT);
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
