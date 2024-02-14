package cs.lab06;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculationTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindMax() {
		System.out.println("Testing findMax method.");
		assertEquals(4, Calculation.findMax(new int[] {1, 2, 4, 3}));
		assertEquals(-2, Calculation.findMax(new int[] {-11, -2, -4, -3}));
	}

	@Test
	public void testReverseWord() {
		assertEquals("abc", Calculation.reverseWord("cba"));
		assertEquals("ym eman si sorryp", Calculation.reverseWord("my name is pyrros"));
	}

}
