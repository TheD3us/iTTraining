package fr.ib.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ib.bo.Salle;
import fr.ib.dal.SalleDAO;

@Service
public class SalleBll {
    @Autowired
	private SalleDAO dao;
	
	public List<Salle> selectAll() {
		return dao.findAll();
	}
	
	public Salle selectById(int id) {
		return dao.findById(id).get();
	}
	
	public void update(Salle salle) {
		dao.save(salle);
	}
	
	public void insert(Salle salle) {
		dao.save(salle);
	}
	
	public void delete(int id) {
		dao.deleteById(id);
	}
	
	public boolean exist(int id) {
		return dao.existsById(id);
	}
    
}
