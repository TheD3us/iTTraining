package fr.ib.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ib.bo.Test;
import fr.ib.dal.TestDAO;

@Service
public class TestBll {
	@Autowired
	private TestDAO dao;
	
	public List<Test> selectAll() {
		return dao.findAll();
	}
	
	public Test selectById(int id) {
		return dao.findById(id).get();
	}
	
	public void update(Test test) {
		dao.save(test);
	}
	
	public void insert(Test test) {
		dao.save(test);
	}
	
	public void delete(int id) {
		dao.deleteById(id);
	}
	
	public boolean exist(int id) {
		return dao.existsById(id);
	}
}
