package hospital;

public class Doctor {
	String name;
	int number;
	String specialty;
	Doctor(String name, int number, String specialty){
		this.name = name;
		this.number = number;
		this.specialty = specialty;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}
	
	public String getSpecialty() {
		return specialty;
	}

	public int calculatePay() {
		return 90000;
	}

}
