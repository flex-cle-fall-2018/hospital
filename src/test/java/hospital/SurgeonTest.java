package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SurgeonTest {

	@Test
	public void ShouldBeOperating() {
		Surgeon surgeon = new Surgeon("Bobert", 234, "Foot Surgeon", true);
		boolean isOperating = surgeon.getCurrentlyOperating();
		assertThat(isOperating, is(true));
	}
	
	@Test
	public void shouldNotBeOperating() {
		Surgeon surgeon = new Surgeon("Bob", 124, "Mouth Surgeon", false);
		boolean isOperating = surgeon.getCurrentlyOperating();
		assertThat(isOperating, is(false));
	}
	
	@Test
	public void shouldBeAnEmployee() {
		Surgeon surgeon = new Surgeon("", 0, "", false);
		assertTrue(surgeon instanceof Employee);
	}
	
	@Test
	public void surgeonShouldHaveSpecialty() {
		// arrange
		Surgeon testSurgeon = new Surgeon("Bob", 123455, "brain", false);
		// act
		String testSpecial = testSurgeon.getSpecialty();
		// assert
		assertThat(testSpecial, is("brain"));
	}
}
