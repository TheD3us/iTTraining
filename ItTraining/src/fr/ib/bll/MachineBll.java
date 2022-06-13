package fr.ib.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ib.bo.Machine;
import fr.ib.dal.MachineDAO;

@Service
public class MachineBll {
    @Autowired
	private MachineDAO dao;
	
	public List<Machine> selectAll() {
		return dao.findAll();
	}
	
	public Machine selectById(int id) {
		return dao.findById(id).get();
	}
	
	public void update(Machine machine) {
		dao.save(machine);
	}
	
	public void insert(Machine machine) {
		dao.save(machine);
	}
	
	public void delete(int id) {
		dao.deleteById(id);
	}
	
	public boolean exist(int id) {
		return dao.existsById(id);
	}
    
    
}
