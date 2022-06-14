package fr.ib.bll;
import fr.ib.bo.Module;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import fr.ib.dal.ModuleDAO;

@Service
public class ModuleBll {
	@Autowired
	private ModuleDAO dao;
	
	public List<Module> selectAll() {
		return dao.findAll();
	}
	
	public Module selectById(int id) {
		return dao.findById(id).get();
	}
	
	public void update(Module module) {
		dao.save(module);
	}
	
	public void insert(Module module) {
		dao.save(module);
	}
	
	public void delete(int id) {
		dao.deleteById(id);
	}
	
	public boolean exist(int id) {
		return dao.existsById(id);
	}
}