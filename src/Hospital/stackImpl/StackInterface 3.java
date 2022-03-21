/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.stackImpl;

/**
 *
 * @author userr
 * @param <E>
 */
public interface StackInterface<E> {	//stack interface
	/**	
	 * Adds a new entry to the top of this stack.@param newEntry An object to be
 added to the stack.
     * @param newEntry
	 */
	public void push(E newEntry);

	/**
	 * Removes and returns this stack's top entry.@return The object at the top of
 the stack.
     * @return 
	 */
	public E pop();

	/**
	 * Retrieves this stack's top entry.@return The object at the top of the
 stack. @throws EmptyStackException if the stack is empty.
     * @return 
	 */
	public E peek();

	/** *  Detects whether this stack is empty.@return True if the stack is empty.
     * @return  */
	public boolean isEmpty();

	/** Removes all entries from this stack. */
	public void clear();
	/** size of Stack
     * @return  **/
	public int size();
} // end StackInterface
