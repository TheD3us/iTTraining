package fr.ib.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ib.bll.TableauDeBordBll;
import fr.ib.vo.TableauDeBord;

@RestController
@RequestMapping("/tableauDeBord")
public class TableauDeBordController {
	@Autowired
	private TableauDeBordBll bll;
	
	@GetMapping
	public ResponseEntity<List<TableauDeBord>> findAll() {
		return new ResponseEntity<List<TableauDeBord>>(bll.selectAll(), HttpStatus.OK);
	}
}
