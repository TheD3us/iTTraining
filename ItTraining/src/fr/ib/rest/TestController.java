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

import fr.ib.bll.TestBll;
import fr.ib.bo.Test;

@RestController
@RequestMapping("/test")
public class TestController {
	@Autowired
	private TestBll bll;
	
	@GetMapping
	public ResponseEntity<List<Test>> findAll() {
		return new ResponseEntity<List<Test>>(bll.selectAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Test> findById(@PathVariable("id") int id) {
		if (bll.exist(id)) {
			return new ResponseEntity<Test>(bll.selectById(id), HttpStatus.OK);
		} else {
			return new ResponseEntity<Test>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public ResponseEntity<Test> insert(@RequestBody Test test) {
		try {
			bll.insert(test);
			return new ResponseEntity<Test>(test, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Test>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Test> update(
											@PathVariable("id") int id,
											@RequestBody Test test) {
		try {
			// Je recupere l'instance telle qu'elle existe en bdd
			Test originalBDD = bll.selectById(id);
			
			originalBDD.setCheminTest(test.getCheminTest());
			originalBDD.setResponseTest(test.getResponseTest());
	
			
			bll.update(originalBDD);
			return new ResponseEntity<Test>(test, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Test>(HttpStatus.CONFLICT);
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
	