package hospital;

public class Nurse extends Employee implements MedicalDuties {

	Nurse(String name, int number) {
		super(name, number);
	}

	@Override
	public int calculatePay() {
		return 50000;
	}

	@Override
	public void careForPatient(Patient testPatient) {
		testPatient.receiveCare();		
	}

}
