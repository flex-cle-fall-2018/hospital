package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {

	@Test
	public void shouldBeAbleToHaveNumber() {
		// Arrange
		Nurse testNurse = new Nurse("", 8796);
		// Act
		int testNumber = testNurse.getNumber();
		// Assert
		assertThat(testNumber, is(8796));
	}

	@Test
	public void shouldBeAbleToHaveName() {
		Nurse testNurse = new Nurse("Ratchet",0);
		String testName = testNurse.getName();
		assertThat(testName, is("Ratchet"));
	}
	
	@Test
	public void shouldBeAbleMake50000() {
		// Arrange
		Nurse testNurse = new Nurse("Ratchet", 8796);
		// Act
		int testPay = testNurse.calculatePay();
		// Assert
		assertThat(testPay, is(50000));
	}
}