package fr.ib.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import fr.ib.bo.Module;

@Repository
public interface ModuleDAO extends JpaRepository<Module, Integer> {



}