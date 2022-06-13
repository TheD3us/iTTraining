package fr.ib.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import fr.ib.bo.Test;


@Repository
public interface TestDAO extends JpaRepository<Test, Integer> {

}
