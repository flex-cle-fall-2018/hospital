package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {

	@Test
	public void doctorShouldHaveName() {
		//Arrange
		Doctor testDoctor = new Doctor("Bob", 0);
		//Act
		String testName = testDoctor.getName();
		//Assert
		assertThat(testName ,is("Bob"));
	}
	
	@Test
	public void doctorShouldHaveNumber() {
		//Arrange
		Doctor testDoctor = new Doctor("Bob", 123455);
		//Act
		int testNumber = testDoctor.getNumber();
		//Assert
		assertThat(testNumber ,is(123455));
	}
}
