package intervals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class intervalTest {

	@Test
	void test() {
		Interval length1 = Interval.create(5,7); 
		//int length1LowerBound = 5; This is a stupid way of doing this , the line above shows how you do this with a data abstraction for representing intervals 
		//int length1UpperBound = 7;
		
		Interval length2 = Interval.create(12, 15);
		//int length2LowerBound =12;
		//int length2UpperBound = 15;
		
		Interval totalLength = Interval.plus(length1, length2);
		//int totalLengthLowerBound = length1LowerBound + length2LowerBound;
		//int totalLengthUpperBound = length1UpperBound + length2UpperBound;
		assertEquals(17, Interval.getLowerBound(totalLength));
		assertEquals(22, Interval.getUpperBound(totalLength));
		assertEquals(5, Interval.getLength(totalLength));
		
	}

}
