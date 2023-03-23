package intervals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class intervalTest {

	@Test
	void test() {
		
		
		Interval length1 = new Interval(5,7); 
		//int length1LowerBound = 5; This is a stupid way of doing this , the line above shows how you do this with a data abstraction for representing intervals 
		//int length1UpperBound = 7;
		
		Interval length2 = new Interval(12, 15);
		//int length2LowerBound =12;
		//int length2UpperBound = 15;
		
		Interval totalLength = length1.plus( length2);
		//int totalLengthLowerBound = length1LowerBound + length2LowerBound;
		//int totalLengthUpperBound = length1UpperBound + length2UpperBound;
		assertEquals(17, totalLength.getLowerBound());
		assertEquals(22, totalLength.getUpperBound());
		assertEquals(5, totalLength.getLength());
		
	}

}
