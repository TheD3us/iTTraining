package fr.ib.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.ib.bo.TableauDeBord;

@Repository
public class TableauDeBordDAO extends JpaRepository<TableauDeBord, Integer>{
    
}
