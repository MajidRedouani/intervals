package intervals;

/**
 * procedure for defining a data abstraction:
 * 1. Define the raw abstraction state space
 * 		= declare the inspectors (specify name and return type, but not yet the body
 * 2. Define the valid abstract state space( = space of valid abstract space)
 * 		= write the abstract state invariants
 * 3. Declare  and document the factory methods and the mutator methods (resp. methods that create new interval objects, methods that change the state of an interval object)
 * 
 * 
 */

/**procedure for implementing a data abstraction:
 * 1. Define the raw concrete state space =
 * 	  define the fields
 * 2. Define the valid concrete state space=
 *    write the representation invariance (constraints on the values of the fields, we write in a java doc comment above the fields
 * 3. Define the mapping from concrete states to abstract states=
 *    implement the inspectors (getters)
 *    Note: every valid concrete state must map to a valid abstract state, so the corresponding abstract state must satisfy the abstract state invariance otherwise there is something wrong with your class
 * 4. Implement the factory methods and the mutator methods
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
	//We want to make sure client can't access the method that's why we use private, if we want to change these fields, client won't break
	
	/**
	 * Representation invariants:
	 * 
	 * @invar | lowerBound <= upperBound (every pair of numbers where the first is not greater than the second one defines a valid concrete state for the interval class)
	 */
	
	private int lowerBound;
	private int upperBound;

	public static int getLowerBound(Interval interval) {return interval.lowerBound; } // we can implement methods before writing them out, we then write: throw new RuntimeException ("not yet implemented");
	
	public static int getUpperBound(Interval interval) {return interval.upperBound; }
	
	public static int getLength (Interval interval) {return(interval.upperBound-interval.lowerBound); }
	
	// you can call this method a derived inspector
		/**
		 *@post | result == (getLowerBound(interval) <= x && x < getUpperBound(interval))
		 * 
		 */
	public static boolean cantains (Interval interval, int x){
		return getLowerBound(interval) <= x && x < getUpperBound(interval); }
	
	
	//allow way for client to create interval objects:
	/*
	 * @pre | lowerBound <= upperBound
	 * @post | getLowerBound (result) == lowerBound
	 * @post | getUpperBound (result) == upperBound
	 */
	
	public static Interval create(int lowerBound, int upperBound) {
		Interval result = new Interval();
		result.lowerBound= lowerBound;
		result.upperBound=upperBound;
		return result;
		}
	/**
	 * @pre | interval !=null
	 * @pre | other !=null
	 * @post | getLowerBound(result) == getLowerBound(interval) + getLowerBound(other)
	 * @post | getUpperBound(result) == getUpperBound(interval) + getUpperBound(other) 
	 * @post | getLength(
	 */
	
	public static Interval plus (Interval interval, Interval other) {
		return create(interval.lowerBound+other.lowerBound, interval.upperBound + other.upperBound); }
	
	// We have now defined an API for the data abstraction
	
	
}
