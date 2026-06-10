package DoctorAndPatientManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
