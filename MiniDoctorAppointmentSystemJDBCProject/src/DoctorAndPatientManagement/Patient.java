package DoctorAndPatientManagement;

public class Patient {
	private int patient_Id;
	private String patient_name;
	private int age;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int patient_Id, String patient_name, int age) {
		super();
		this.patient_Id = patient_Id;
		this.patient_name = patient_name;
		this.age = age;
	}

	public int getPatient_Id() {
		return patient_Id;
	}

	public void setPatient_Id(int patient_Id) {
		this.patient_Id = patient_Id;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Patient [patient_Id=" + patient_Id + ", patient_name=" + patient_name + ", age=" + age + "]";
	}

}
