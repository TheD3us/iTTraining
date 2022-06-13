package dal;

public class TestDAOjdbclmpl {
	

	package fr.ib.dal;

	import java.sql.Connection;
	import java.sql.SQLException;

	import bo.Test;

	public class TestDAOJdbcImpl implements TestDAO {

		@Override
		public Test select(int id) {
			Test test = new Test();
			
			Connection cnx = ConnectionProvider.getConnection();
			try {
				PreparedStatement ps = cnx.prepareStatement("SELECT * FROM test WHERE id = ?");
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				
			if (rs.next()) {
					test.setId(id);
					test.setCheminTest(rs.getString("chenin_test"));
					test.setResponseTest(rs.getString("reponse_test"));
				
				}
				
				cnx.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}	
			return test;
		}

		@Override
		public void insert(Test test) {
			try {
				Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement ps = cnx.prepareStatement(
						"INSERT INTO test (cheminTest, responseTest,)"
						+ " VALUES (?,?)",
						PreparedStatement.RETURN_GENERATED_KEYS
				);
				ps.setString(1, module.getCheminTest));
				ps.setString(2, module.getResponseTest));
				
			
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
				PreparedStatement ps = cnx.prepareStatement("DELETE FROM test WHERE id = ?");
				ps.setInt(1, id);
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

		@Override
		public void update(Test test) {
			try {
				Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement ps = cnx.prepareStatement(
						"UPDATE module "
						+ " SET cheminTest = ?,"
						+ " responseTest = ?,"
						
				);
				ps.setString(1, test.getcheminTest());
				ps.setString(2, test.getresponseTest))			
				ps.executeUpdate();
				cnx.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
