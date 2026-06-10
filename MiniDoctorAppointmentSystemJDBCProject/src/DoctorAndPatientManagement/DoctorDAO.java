package DoctorAndPatientManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DoctorDAO {
	public void addDoctor(Doctor doctor) {
		Connection connection = DBConnection.getConnection();
		String query = "INSERT INTO Doctor VALUES (?,?,?,?)";

		try {
			PreparedStatement ps = connection.prepareStatement(query);

			ps.setInt(1, doctor.getDoc_Id());
			ps.setString(2, doctor.getDoc_name());
			ps.setString(3, doctor.getSpecialization());
			ps.setString(4, doctor.getExperience());

			int rows = ps.executeUpdate();

			System.out.println("Added Doctor details Successfully.");

			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void viewDoctor() {
		Connection connection = DBConnection.getConnection();
		String query = "SELECT * FROM Doctor";
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				System.out.println("-------------------------------------------");
				System.out.println("Id: " + resultSet.getInt("doc_Id"));
				System.out.println("Name: " + resultSet.getString("doc_name"));
				System.out.println("Specialization: " + resultSet.getString("specialization"));
				System.out.println("Experience: " + resultSet.getString("experience"));
				System.out.println("----------------------------------------------");
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateDoctor(int doc_Id, Doctor doctor) {
		Connection connection = DBConnection.getConnection();

		String query = "UPDATE Doctor SET doc_name=?,specialization=?,experience=? WHERE doc_Id=?";

		try {
			PreparedStatement ps = connection.prepareStatement(query);

			ps.setString(1, doctor.getDoc_name());
			ps.setString(2, doctor.getSpecialization());
			ps.setString(3, doctor.getExperience());
			ps.setInt(4, doc_Id);

			int rows = ps.executeUpdate();
			System.out.println("rows updated");
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteDoctor(int id) {
		Connection connection = DBConnection.getConnection();
		String query = "DELETE FROM Doctor WHERE doc_Id=?";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, id);
			int rows = ps.executeUpdate();
			System.out.println("row deleted");
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
