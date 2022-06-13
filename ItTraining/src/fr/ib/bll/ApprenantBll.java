package fr.ib.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ib.bo.Formateur;
import fr.ib.dal.FormateurDAO;

@Service
public class ApprenantBll {
	@Autowired
	private ApprenantDAO dao;
	
	public List<Apprenant> selectAll() {
		return dao.findAll();
	}
	
	public Apprenant selectById(int id) {
		return dao.findById(id).get();
	}
	
	public void update(Apprenant apprenant) {
		dao.save(formateur);
	}
	
	public void insert(Apprenant apprenant) {
		dao.save(apprenant);
	}
	
	public void delete(int id) {
		dao.deleteById(id);
	}
	
	public boolean exist(int id) {
		return dao.existsById(id);
	}
}
