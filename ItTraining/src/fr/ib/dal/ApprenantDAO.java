package fr.ib.dal;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.ib.bo.Apprenant;



@Repository
public interface ApprenantDAO extends JpaRepository<Apprenant, Integer> {


}

