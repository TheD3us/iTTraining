package fr.ib.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ib.bo.Formateur;
import fr.ib.dal.FormateurDAO;

@Service
public class FormateurBll {
	@Autowired
	private FormateurDAO dao;
	
	public List<Formateur> selectAll() {
		return dao.findAll();
	}
	
	public Formateur selectById(int id) {
		return dao.findById(id).get();
	}
	
	public void update(Formateur formateur) {
		dao.save(formateur);
	}
	
	public void insert(Formateur formateur) {
		dao.save(formateur);
	}
	
	public void delete(int id) {
		dao.deleteById(id);
	}
	
	public boolean exist(int id) {
		return dao.existsById(id);
	}
}
