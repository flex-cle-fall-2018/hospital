package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {

	@Test
	public void doctorShouldHaveName() {
		//Arrange
		Doctor testDoctor = new Doctor("Bob", 0, "brain");
		//Act
		String testName = testDoctor.getName();
		//Assert
		assertThat(testName ,is("Bob"));
	}
	
	@Test
	public void doctorShouldHaveNumber() {
		//Arrange
		Doctor testDoctor = new Doctor("Bob", 123455, "brain");
		//Act
		int testNumber = testDoctor.getNumber();
		//Assert
		assertThat(testNumber ,is(123455));
	}
	
	@Test
	public void doctorShouldHaveSpecialty() {
		//arrange
		Doctor testDoctor = new Doctor("Bob", 123455, "brain");
		//act
		String testSpecial = testDoctor.getSpecialty();
		//assert
		assertThat(testSpecial, is("brain"));
	}
	
	@Test
	public void doctorShouldMake90000() {
		//Arrange
		Doctor testDoctor = new Doctor("Bob", 123455, "brain");
		//Act
		int testPay = testDoctor.calculatePay();		
		//Assert
		assertThat(testPay, is(90000));
	}
}
