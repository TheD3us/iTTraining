package fr.ib.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.ib.bo.Formation;

public interface FormationDAO extends JpaRepository<Formation, Integer>{

}
