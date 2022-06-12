package fr.ib.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.ib.bo.Salle;

public class SalleDAO extends JpaRepository<Salle, Integer> {
    
}
