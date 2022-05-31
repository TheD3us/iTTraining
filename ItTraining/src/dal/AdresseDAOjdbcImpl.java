package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bo.Adresse;

public class AdresseDAOjdbcImpl implements AdresseDAO {

	@Override
	public Adresse select(int id) {
		Connection cnx = ConnectionProvider.getConnection();
		Adresse adresse = new Adresse();
		PreparedStatement ps;
		try {
			ps = cnx.prepareStatement("SELECT * FROM adresse WHERE id = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next() != false) {
			
			adresse.setId(rs.getInt("id"));
			adresse.setNoRue(rs.getInt("no_rue"));
			adresse.setComplement(rs.getString("complement"));
			adresse.setTypeVoie(rs.getString("type_voie"));
			adresse.setCpo(rs.getString("cpo"));
			adresse.setVille(rs.getString("ville"));
			adresse.setEtage(rs.getString("etage"));
			adresse.setAppartement(rs.getInt("appartement"));
			
			cnx.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return adresse;
	}

	@Override
	public List<Adresse> selectAll() {
		List<Adresse> listeAdresse = new ArrayList<Adresse>();
		Connection cnx = ConnectionProvider.getConnection();
		
		PreparedStatement ps;
		try {
			ps = cnx.prepareStatement("SELECT * FROM adresse");
			ResultSet rs = ps.executeQuery();
			while(rs.next() != false) {
			Adresse adresse = new Adresse();
			adresse.setId(rs.getInt("id"));
			adresse.setNoRue(rs.getInt("no_rue"));
			adresse.setComplement(rs.getString("complement"));
			adresse.setTypeVoie(rs.getString("type_voie"));
			adresse.setCpo(rs.getString("cpo"));
			adresse.setVille(rs.getString("ville"));
			adresse.setEtage(rs.getString("etage"));
			adresse.setAppartement(rs.getInt("appartement"));
			listeAdresse.add(adresse);
			cnx.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listeAdresse;
	}

	@Override
	public void insert(Adresse adresse) {
		Connection cnx = ConnectionProvider.getConnection();
		
		PreparedStatement ps;
		
		try {
			ps = cnx.prepareStatement("INSERT INTO adresse (id, no_rue, complement, type_voie, nom_voie, cpo, ville, etage, appartement) VALUES (?,?,?,?,?,?,?,?,?);");
			ps.setInt(1, adresse.getId());
			ps.setInt(2, adresse.getNoRue());
			ps.setString(3, adresse.getComplement());
			ps.setString(4, adresse.getTypeVoie());
			ps.setString(5, adresse.getNomVoie());
			ps.setString(6, adresse.getCpo());
			ps.setString(7, adresse.getVille());
			ps.setString(8, adresse.getEtage());
			ps.setInt(9, adresse.getAppartement());
			ps.executeUpdate();
			cnx.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Adresse adresse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
