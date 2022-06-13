package dal;


******************
package fr.ib.dal;

import bo.Contact;

public interface ContactDAO {
	Contact select(int id);
	void insert(Contact contact);
	void delete(int id);
	void update(Contact contact);
}
*******************

public class ModuleDAO {

}
