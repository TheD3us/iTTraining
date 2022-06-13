package fr.ib.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ib.vo.TableauDeBord;
import fr.ib.dal.TableauDeBordDAO;

@Service
public class TableauDeBordBll {
	@Autowired
	private TableauDeBordDAO dao;
    
	public List<TableauDeBord> selectAll() {
		return dao.findAll();
	}
	
	public void update(TableauDeBord tableauDeBord) {
		dao.save(tableauDeBord);
	}
	
	public void insert(TableauDeBord tableauDeBord) {
		dao.save(tableauDeBord);
	}
}

