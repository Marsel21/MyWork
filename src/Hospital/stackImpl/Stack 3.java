
package Hospital.stackImpl;

/**
 *
 * @author userr
 */
//7):inheritance used here
//15): Stack class with interface and constructur
//16): isEmpty() method is used here
//17): checkups for errors 
//18): push, pop, top, isEmpty, size
public class Stack<E> implements StackInterface<E> {
    

    
	private class Node {

		E data; // String data
		Node next; // reference variable Node type
	}

	private int size;	//stack size
	Node top;	//stack top element

	public Stack(){	
		size = 0;
		top = null;
	}

	public boolean isEmpty() {	//check if empty
		return size == 0;
	}
	
	public int size() {	//return size
		return size;
	}

	public void show() {	//dispaly
		if(top!=null) {
		Node n = top;
		System.out.print("The Stacks Contains [");
		for (int i = 0; i < size; i++) {
			System.out.print(n.data + ", ");
			n = n.next;
		}
		System.out.print("]\n");
		}else {
			System.out.println("The Stack is Empty");
		}
		
	}
	public void push(E data) {	//push element
		Node oldtop = new Node();
		oldtop.data = data;
		oldtop.next = top;
		top = oldtop;
		++size;
	}

        @Override
	public E peek() {	//peek Implementation
		if (isEmpty()) {
			throw new java.util.EmptyStackException();
		}
		return top.data;
	}

	public E pop() {	//delete first element from stack
		if (isEmpty())
			throw new java.util.NoSuchElementException();
		E oldtop = top.data;
		top = top.next;
		--size;
		return oldtop;
	}
	
	public void clear() {	//clear stack
		top=null;
		
	}
       
}

