package dal;

public class FormationDAOjdbclmpl {
	

	package fr.ib.dal;

	import java.sql.Connection;
	import java.sql.Date;
	import java.sql.SQLException;

	import bo.Formation;

	public class FormationDAOJdbcImpl implements FormationDAO {

		@Override
		public Formation select(int id) {
			Formation formation = new Formation();
			
			Connection cnx = ConnectionProvider.getConnection();
			try {
				PreparedStatement ps = cnx.prepareStatement("SELECT * FROM formation WHERE id = ?");
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				
			if (rs.next()) {
					fomration.setId(id);
					formation.setNom(rs.getString("nom"));
					formation.setModule(rs.getString("module"));
					formation.setdateDeDebut(rs.getDate("date_de_debut").toLocalDate());
					formation.setdateDeFin(rs.getDate("date_de_Fin").toLocalDate());							
					formation.setNiveau(rs.getString("niveau"));
					formation.setTest(rs.getString("test"));
					formation.setApprenant(rs.getString("apprenant"));
					formation.setformateur(rs.getString("formateur"));
					formation.settheme(rs.getString("theme"));
					formation.setsoustheme(rs.getString("soustheme"));
				}
				
				cnx.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
						
			return formation;
		}

		@Override
		public void insert(Formation formation) {
			try {
				Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement ps = cnx.prepareStatement(
						"INSERT INTO formation (nom, module, date_de_debut, date_de_fin, niveau, test, apprenant, salle, formateur, theme, sous theme,)"
						+ " VALUES (?,?,?,?,?,?,?,?,?;?,?)",
						PreparedStatement.RETURN_GENERATED_KEYS
				);
				ps.setString(1, formation.getNom());
				ps.setString(2, formation.getModule());
				ps.setDate(3, Date.valueOf(formation.getDateDeDebut()));
				ps.setDate(4, Date.valueOf(formation.getDateDeFin()));
				ps.setString(5, formation.getNiveau());
				ps.setString(6, formation.getTest());
				ps.setString(7, formation.getApprenant());
				ps.setString(8, formation.getSalle());
				ps.setString(9, formation.getFormateur());
				ps.setString(10, formation.getTheme());
				ps.setString(11, formation.getSousTheme());
			
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
				PreparedStatement ps = cnx.prepareStatement("DELETE FROM foramtion WHERE id = ?");
				ps.setInt(1, id);
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

		@Override
		public void update(Formation formation) {
			try {
				Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement ps = cnx.prepareStatement(
						"UPDATE formation "
						+ " SET nom = ?,"
						+ " module = ?,"
						+ " date_de_debut = ?,"
						+ " date_de_fin = ?,"
						+ " niveau = ?,"
						+ " test = ?,"
						+ " apprenant = ?,"
						+ " salle = ? "
						+ " formateur  = ?,"
						+ " theme = ? "
						+ " soustheme= ? "
						+ "WHERE id = ?"
				);
				ps.setString(1, formation.getNom());
				ps.setString(2, formation.getModule());
				ps.setDate(3, Date.valueOf(formation.getDateDeDebut()));
				ps.setDate(4, Date.valueOf(formation.getDateDeFint()));
				ps.setString(5, formation.getNiveau());
				ps.setString(6, formation.getTest());
				ps.setString(7, formation.getApprenant());
				ps.setString(8, formation.getSalle());
				ps.setInt(9, formation.getFormateur());
				ps.setInt(10, formation.getTheme());
				ps.setInt(11, formation.getSousTheme());

				
				ps.executeUpdate();
				cnx.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
	


