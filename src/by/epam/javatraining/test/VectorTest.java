package by.epam.javatraining.test;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

import by.epam.javatraining.logic.model.*;

public class VectorTest {

	private double[] actual = { 21.7, 0.3, 5 };
	Vector v = new Vector(actual);

	@Test
	public void testFindMinElement() {
		double expected = 0.3;
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
	public void testGetArifmeticalAverage() {
		double expected = 9;
		if (expected != v.getArifmeticalAverage()) {
			fail();
		}
	}

	@Test
	public void testGetGeometryAverage() {
		double expected = 3;
		if (expected == v.getGeometryAverage()) {
			fail();
		}
	}

	@Test
	public void testIsSort() {
		boolean expected=false;
		assertEquals(expected, v.isSort());
		
	}

	@Test
	public void testFindPositionOfFirstLocMin() {
		int expected=2;
		assertEquals(expected, v.findPositionOfFirstLocMin());
	}

	@Test
	public void testBinarySearch() {
		int expected=2;
		assertEquals(expected, v.binarySearch(5));
	}

	@Test
	public void testReverseVector() {
		double[] expected= {5,0.3,21.7};
		v.reverseVector();
		if(!(Arrays.equals(expected, v.vector))) {
			fail();
		}
	}
	
}
