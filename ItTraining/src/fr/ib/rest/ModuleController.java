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

import fr.ib.bll.ModuleBll;
import fr.ib.bo.Module;


@RestController
@RequestMapping("/module")
public class ModuleController {
	@Autowired
	private ModuleBll bll;
	
	@GetMapping
	public ResponseEntity<List<Module>> findAll() {
		return new ResponseEntity<List<Module>>(bll.selectAll(), HttpStatus.OK);		
	}
		
	@GetMapping(value = "/{id}")
	public ResponseEntity<Module> findById(@PathVariable("id") int id) {
		if (bll.exist(id)) {
			return new ResponseEntity<Module>(bll.selectById(id), HttpStatus.OK);
		} else {
			return new ResponseEntity<Module>(HttpStatus.NOT_FOUND);
		}
	}	
	
	@PostMapping
	public ResponseEntity<Module> insert(@RequestBody Module module) {
		try {
			bll.insert(module);
			return new ResponseEntity<Module>(module, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Module>(HttpStatus.CONFLICT);
		}
	}
		
	@PutMapping(value = "/{id}")
	public ResponseEntity<Module> update(
											@PathVariable("id") int id,
											@RequestBody Module module) {
		try {
			// Je recupere l'instance telle qu'elle existe en bdd
			Module originalBDD = bll.selectById(id);
			
			originalBDD.setNom(module.getNom());
			originalBDD.setFormateur(module.getFormateur());
			//originalBDD.setNote(note.getNote());
			originalBDD.setListeModule(module.getListeModule());
		
			
			
			bll.update(originalBDD);
			return new ResponseEntity<Module>(module, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Module>(HttpStatus.CONFLICT);
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
		
		
		
		
		
		
		