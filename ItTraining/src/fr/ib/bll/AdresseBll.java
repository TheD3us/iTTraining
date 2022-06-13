package fr.ib.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ib.bo.Adresse;
import fr.ib.dal.AdresseDAO;

@Service
public class AdresseBll {
	@Autowired
	private AdresseDAO dao;
	
	public List<Adresse> selectAll() {
		return dao.findAll();
	}
	
	public Adresse selectById(int id) {
		return dao.findById(id).get();
	}
	
	public void update(Adresse adresse) {
		dao.save(adresse);
	}
	
	public void insert(Adresse adresse) {
		dao.save(adresse);
	}
	
	public void delete(int id) {
		dao.deleteById(id);
	}
	
	public boolean exist(int id) {
		return dao.existsById(id);
	}
}
