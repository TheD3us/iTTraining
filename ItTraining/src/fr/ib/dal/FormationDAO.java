package fr.ib.dal;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.ib.bo.Formation;

@Repository
public interface FormationDAO extends JpaRepository<Formation, Integer>{


}
