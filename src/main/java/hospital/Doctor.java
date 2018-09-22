package hospital;

public class Doctor extends Employee implements MedicalDuties {
	String specialty;

	Doctor(String name, int number, String specialty) {
		super(name, number);
		this.specialty = specialty;
	}

	public String getSpecialty() {
		return specialty;
	}

	@Override
	public int calculatePay() {
		return 90000;
	}
	
	@Override
	public void careForPatient(Patient testPatient) {
		testPatient.receiveCare();
	}

}
