package hospital;

public class Nurse extends Employee {

	Nurse(String name, int number) {
		super(name, number);
	}

	@Override
	public int calculatePay() {
		return 50000;
	}

}
