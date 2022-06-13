package fr.ib.bll;

<<<<<<< HEAD
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ib.vo.TableauDeBord;
import fr.ib.dal.TableauDeBordDAO;

@Service
=======
>>>>>>> 52704445f2d929cdfbebbd57d2a0914bb27013b0
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

