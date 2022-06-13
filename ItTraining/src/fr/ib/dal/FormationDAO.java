package fr.ib.dal;

<<<<<<< HEAD
*****************


import bo.Formation;

public interface FormationDAO {
	Contact select(int id);
	void insert(Contact contact);
	void delete(int id);
	void update(Contact contact);
}
***************





public class FormationDAO {
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.ib.bo.Formation;

@Repository
public interface FormationDAO extends JpaRepository<Formation, Integer>{
>>>>>>> 12402b9f345d4d6d21bb6fa31ff259a2f1df2a57

}
