package by.epam.javatraining.test;

import static org.junit.Assert.*;

import org.junit.Test;
import by.epam.javatraining.logic.model.*;

public class MatrixTest {

	private double[][] actual = { { 21.7, 0.3, 5 }, { 15, 0.1, 4 }, { 0, -16, 1 } };
	Matrix v = new Matrix(actual);

	@Test
	public void testFindMinElement() {
		double expected = -16;
		if (expected != v.findMinElement()) {
			fail("min element didn't find");
		}
	}

	@Test
	public void testFindMaxElement() {
		double expected = 21.7;
		if (expected != v.findMaxElement()) {
			fail("max element didn't find");
		}
	}

	@Test
	public void testIsSimmetrical() {
		boolean expected = false;
		if (expected != v.isSimmetrical()) {
			fail();
		}
	}

	@Test
	public void testIsMirrowSimmetrical() {
		boolean expected = false;
		if (expected != v.isMirrowSimmetrical()) {
			fail();
		}
	}

	@Test
	public void testTranspose() {
		double[][] expected = { { 21.7, 15, 0 }, { 0.3, 0.1, -16 }, { 5, 4, 1 } };
		v.transpose();
		for (int i = 0; i < v.matrix.length; i++) {
			for (int j = 0; j < v.matrix[i].length; j++) {
				assertEquals(actual[i][j], expected[i][j], 0.0);
			}
		}
	}

}
