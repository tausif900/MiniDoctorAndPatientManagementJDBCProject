package DoctorAndPatientManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PatientDAO {

	public void addPatient(Patient patient) {
		Connection connection = DBConnection.getConnection();
		String query = "INSERT INTO Patient VALUES (?,?,?)";

		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, patient.getPatient_Id());
			ps.setString(2, patient.getPatient_name());
			ps.setInt(3, patient.getAge());

			int row = ps.executeUpdate();
			System.out.println("rows updated");

			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void viewPatient() {
		Connection connection = DBConnection.getConnection();
		String query = "SELECT * FROM Patient";
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				System.out.println("Id: " + resultSet.getInt("patient_id"));
				System.out.println("Name: " + resultSet.getString("patient_name"));
				System.out.println("Age: " + resultSet.getInt("age"));
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updatePatient(int id, int age) {
		Connection connection = DBConnection.getConnection();
		String query = "UPDATE Patient SET age=? WHERE patient_id=?";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, age);
			ps.setInt(2, id);

			int rows = ps.executeUpdate();
			System.out.println("row updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deletePatient(int id) {
		Connection connection = DBConnection.getConnection();
		String query = "DELETE FROM Patient WHERE patient_id=?";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, id);

			int row = ps.executeUpdate();
			System.out.println("row deleted successfully");
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchPatient(int id) {
		Connection connection = DBConnection.getConnection();
		String query = "SELECT * FROM Patient WHERE patient_id=?";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, id);

			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {
				System.out.println("Name: " + resultSet.getString("patient_name"));
				System.out.println("Age: " + resultSet.getInt("age"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
