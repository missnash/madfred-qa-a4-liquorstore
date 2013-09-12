import static org.junit.Assert.*;
import org.junit.Test;


public class TestAgeChecker {
	
	AgeChecker tester = new AgeChecker();
	
	@Test
	public void testVerifyAgeRestrictionTrue() {
		boolean result = tester.verifyLegalAge(1976);
		assertTrue(result);
	}
	
	@Test
	public void testVerifyAgeRestrictionFalse() {
		boolean result = tester.verifyLegalAge(2006);
		assertFalse(result);
	}
	
	@Test
	public void testConcatenateNames() {
		String result = tester.concatenateNames("Ashley", "Nash");
		assertEquals(result, "Ashley Nash");
		
	}
		
	}
	
