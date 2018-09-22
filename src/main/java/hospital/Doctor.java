package hospital;

public class Doctor extends Employee {
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

}
