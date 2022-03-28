package array.pavan;

import java.util.Stack;
public class StackClassExample {

	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<Integer>();
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		System.out.println("The Stack size is " + myStack.size());
		System.out.println("The top of stack is " + myStack.peek());
		while(!myStack.isEmpty()) {
			System.out.println("poped item "+ myStack.pop());
		}
	}

}
