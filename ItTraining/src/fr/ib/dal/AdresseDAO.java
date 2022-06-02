package fr.ib.dal;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.ib.bo.Adresse;



@Repository
public interface AdresseDAO extends JpaRepository<Adresse, Integer> {


}

