package dal;

import java.util.List;

import bo.Adresse;

public interface AdresseDAO {
	Adresse select(int id);
	List<Adresse> selectAll();
	void insert(Adresse adresse);
	void update(Adresse adresse);
	void delete(int id);
}
