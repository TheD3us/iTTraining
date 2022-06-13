package fr.ib.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.ib.vo.TableauDeBord;

@Repository
public interface TableauDeBordDAO extends JpaRepository<TableauDeBord, Integer>{
    
}
