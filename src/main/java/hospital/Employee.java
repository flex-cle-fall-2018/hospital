package hospital;

public abstract class Employee {
	
	private String name;
	private int number;
	
	Employee(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public abstract int calculatePay();
	
	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}
}
