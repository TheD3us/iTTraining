package fr.ib.dal;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.ib.bo.Formateur;



@Repository
public interface FormateurDAO extends JpaRepository<Formateur, Integer> {


}

