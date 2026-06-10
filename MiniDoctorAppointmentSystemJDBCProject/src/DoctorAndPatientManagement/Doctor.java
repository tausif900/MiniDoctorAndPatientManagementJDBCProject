package DoctorAndPatientManagement;

public class Doctor {
	private int doc_Id;
	private String doc_name;
	private String specialization;
	private String experience;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(int doc_Id, String doc_name, String specialization, String experience) {
		super();
		this.doc_Id = doc_Id;
		this.doc_name = doc_name;
		this.specialization = specialization;
		this.experience = experience;
	}

	public Doctor(String doc_name, String specialization, String experience) {
		super();
		this.doc_name = doc_name;
		this.specialization = specialization;
		this.experience = experience;
	}

	public int getDoc_Id() {
		return doc_Id;
	}

	public void setDoc_Id(int doc_Id) {
		this.doc_Id = doc_Id;
	}

	public String getDoc_name() {
		return doc_name;
	}

	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Doctor [doc_Id=" + doc_Id + ", doc_name=" + doc_name + ", specialization=" + specialization
				+ ", experience=" + experience + "]";
	}

}
