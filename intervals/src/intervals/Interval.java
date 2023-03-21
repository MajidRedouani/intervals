package intervals;

/*
 * procedure for defining a data abstraction:
 * 1. Define the raw abstraction state space
 * 		= declare the inspectors (specify name and return type, but not yet the body
 * 2. Define the valid abstract state space( = space of valid abstract space)
 * 		= write the abstract state invariants
 * 3. Declare  and document the factory methods and the mutator methods (resp. methods that create new interval objects, methods that change the state of an interval object)
 * 
 * 
 */

/**
 * Abstract  state invariants: (you don't need to necessarily write this)
 * 
 * @invar The lower bound is not greater than the upper bound (informal)
 * 		| getLowerBound(this) <= getUpperBound(this) (formal)
 * @invar The length equals the difference between the upper and lower bound
 * 		| getLength(this) == getUpperBound(this) - getLowerBound(this)
 * 
 */

public class Interval {

	public static int getLowerBound(Interval interval) {throw new RuntimeException ("not yet implemented"); } // we can implement methods before writing them out
	
	public static int getUpperBound(Interval interval) {throw new RuntimeException ("not yet implemented"); }
	
	public static int getLength (Interval interval) {throw new RuntimeException ("not yet implemented"); }
	
	// you can call this method a derived inspector
		/**
		 *@post | result == (getLowerBound(interval) <= x && x < getUpperBound(interval))
		 * 
		 */
	public static boolean cantains (Interval interval, int x){throw new RuntimeException ("not yet implemented"); }
	
	
	//allow way for client to create interval objects:
	/*
	 * @pre | lowerBound <= upperBound
	 * @post | getLowerBound (result) == lowerBound
	 * @post | getUpperBound (result) == upperBound
	 */
	
	public static Interval create(int LowerBound, int UpperBound) {throw new RuntimeException ("not yet implemented"); }
	/**
	 * @pre | interval !=null
	 * @pre | other !=null
	 * @post | getLowerBound(result) == getLowerBound(interval) + getLowerBound(other)
	 * @post | getUpperBound(result) == getUpperBound(interval) + getUpperBound(other) 
	 * @post | getLength(
	 */
	
	public static Interval plus (Interval interval, Interval other) {throw new RuntimeException ("not yet implemented"); }
	
	// We have now defined an API for the data abstraction
	
	
}
