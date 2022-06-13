package fr.ib.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ib.bo.Formation;
import fr.ib.dal.FormationDAO;

@Service
public class FormationBll {
	@Autowired
	private FormationDAO dao;
	
	public List<Formation> selectAll() {
		return dao.findAll();
	}
	
	public Formation selectById(int id) {
		return dao.findById(id).get();
	}
	
	public void update(Formation formation) {
		dao.save(formation);
	}
	
	public void insert(Formation formation) {
		dao.save(formation);
	}
	
	public void delete(int id) {
		dao.deleteById(id);
	}
	
	public boolean exist(int id) {
		return dao.existsById(id);
	}
}

