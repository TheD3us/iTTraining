package fr.ib.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.ib.bo.Machine;

@Repository
public interface MachineDAO extends JpaRepository<Machine, Integer> {
    
}
