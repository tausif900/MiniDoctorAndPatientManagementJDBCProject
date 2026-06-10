package DoctorAndPatientManagement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DoctorDAO doctorDAO = new DoctorDAO();

		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Doctor And Patient Management Syatem.");
			System.out.println("1.Add Doctors");
			System.out.println("2.View Doctors");
			System.out.println("3.Update Doctors");
			System.out.println("4.Delete Doctors");
			System.out.println("5.Search Doctors");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
//				Adding Doctor Details..
				System.out.println("Enter Doctors details: ");

				System.out.println("Enter doctor Id: ");
				int doc_Id = input.nextInt();

				System.out.println("Enter doctor name: ");
				String doc_name = input.next();

				System.out.println("Enter doctor specialization: ");
				String specialization = input.next();

				System.out.println("Enter doctor experience: ");
				String experience = input.next();

				Doctor doctor = new Doctor(doc_Id, doc_name, specialization, experience);
				doctorDAO.addDoctor(doctor);

				break;
			case 2:
//				View Doctors..........
				doctorDAO.viewDoctor();
				break;
			case 3:
//				Update Doctors..........
				System.out.println("Enter Doctor Id to update: ");
				int doc_id = input.nextInt();

				System.out.println("Enter name to update:");
				String updatedName = input.next();

				System.out.println("Enter specialization to update:");
				String updatedSpecialization = input.next();

				System.out.println("Enter experience to update:");
				String updatedExperienced = input.next();

				Doctor updatedDoctors = new Doctor(updatedName, updatedSpecialization, updatedExperienced);
				doctorDAO.updateDoctor(doc_id, updatedDoctors);

				System.out.println("Details Updated Successfully");
				break;
			case 4:
//				Delete Doctors............
				System.out.println("Enter Doctor Id to delete: ");
				int id = input.nextInt();
				doctorDAO.deleteDoctor(id);
				break;
			case 5:
				System.out.println("Enter Doctor Id to search Doctor: ");
				int sId = input.nextInt();
				doctorDAO.searchDoctor(sId);
				System.exit(0);
			default:
				System.out.println("Invalid Operation");
			}
		}
	}
}
