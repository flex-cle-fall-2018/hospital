package hospital;

public class Doctor {
	String name;
	int number;
	
	Doctor(String name, int number){
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

}
