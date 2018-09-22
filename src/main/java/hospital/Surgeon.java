package hospital;

public class Surgeon extends Doctor {

	private boolean isOperating;

	public Surgeon(String name, int number, String specialty, boolean isOperating) {
		super(name, number, specialty);
		this.isOperating = isOperating;
	}

	public boolean getCurrentlyOperating() {
		return isOperating;
	}

	@Override
	public int calculatePay() {
		return 120000;
	}
}
