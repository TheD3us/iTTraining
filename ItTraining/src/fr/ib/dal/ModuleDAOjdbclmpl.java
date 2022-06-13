package dal;

public class ModuleDAOjdbclmpl {
	

	package fr.ib.dal;

	import java.sql.Connection;
	import java.sql.SQLException;

	import bo.Module;

	public class ModuleDAOJdbcImpl implements ModuleDAO {

		@Override
		public Module select(int id) {
			Module module = new Module();
			
			Connection cnx = ConnectionProvider.getConnection();
			try {
				PreparedStatement ps = cnx.prepareStatement("SELECT * FROM module WHERE id = ?");
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				
			if (rs.next()) {
					module.setId(id);
					module.setNom(rs.getString("nom"));
					module.setFormateur(rs.getString("formateur"));
					module.setNote(rs.getInt("note"));
					module.setListeModule(rs.getString("module"));
				}
				
				cnx.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}	
			return module;
		}

		@Override
		public void insert(Module module) {
			try {
				Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement ps = cnx.prepareStatement(
						"INSERT INTO module (nom, formateur, note, liste_module,)"
						+ " VALUES (?,?,?,?,?)",
						PreparedStatement.RETURN_GENERATED_KEYS
				);
				ps.setString(1, module.getNom());
				ps.setString(2, module.getFormateur());
				ps.setString(3, module.getNote());
				ps.setString(4, module.getListeModule());
				
			
				ps.executeUpdate();
				ResultSet rs = ps.getGeneratedKeys();
				if (rs.next()) {
					contact.setId(rs.getInt(1));
				}
				cnx.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void delete(int id) {
			// Syntaxe alternative pour ouvrir la connexion qui se fermera automatiquement en quittant le try
			try (Connection cnx = ConnectionProvider.getConnection()) {
				PreparedStatement ps = cnx.prepareStatement("DELETE FROM module WHERE id = ?");
				ps.setInt(1, id);
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

		@Override
		public void update(Formationt formation) {
			try {
				Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement ps = cnx.prepareStatement(
						"UPDATE module "
						+ " SET nom = ?,"
						+ " formateur = ?,"
						+ " note = ?,"
						+ " listeModule = ?,"
						+ "WHERE id = ?"
				);
				ps.setString(1, module.getNom());
				ps.setString(2, modulen.getFormateur());
				ps.setString(3, module.getNote());
				ps.setString(4, module.getlisteModule());				
				ps.executeUpdate();
				cnx.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
