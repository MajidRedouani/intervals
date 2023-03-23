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
 * 		| this.getLowerBound() <= this.getUpperBound() (formal)
 * @invar The length equals the difference between the upper and lower bound
 * 		| this.getLength() == this.getUpperBound() - this.getLowerBound()
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

	public int getLowerBound() {return this .lowerBound; } // we can implement methods before writing them out, we then write: throw new RuntimeException ("not yet implemented");
	
	public  int getUpperBound() {return this .upperBound; }
	
	public  int getLength () {return(upperBound-lowerBound); }
	
	// you can call this method a derived inspector
		/**
		 *@post | result == (getLowerBound() <= x && x < getUpperBound())
		 * 
		 */
	public  boolean cantains ( int x){//you may only remove the explicit parameter when making an instance method
		return getLowerBound() <= x && x <getUpperBound(); }
	
	//default constructor, now that we explicitly define it, we can define parameters for it, e.g. you have to specify a lower and upper bound
	//Because we have the constructor method we can get rid of the create method
	/*
	 * @pre | lowerBound <= upperBound
	 * @post | getLowerBound () == lowerBound
	 * @post | getUpperBound () == upperBound
	 */
	public Interval(int lowerBound, int upperBound) {
		this.lowerBound=lowerBound;
		this.upperBound=upperBound;
	}
	
	
	/**
	 * @pre | other !=null
	 * @post | result.getLowerBound() == getLowerBound() + other.getLowerBound()
	 * @post | result.getUpperBound() == getUpperBound() + other.getUpperBound() 
	 * 
	 */
	
	public  Interval plus ( Interval other) {
		return new Interval(lowerBound+other.lowerBound, this.upperBound + other.upperBound); }
	
	// We have now defined an API for the data abstraction
	
	
}
