package Queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class TesterQ2 {
	
	public static Deque<Character> updateStack(Deque<Character> inputStack) {
		Deque<Character> tempStack = new ArrayDeque<Character>();
		
		for (int i = 0; i <= 2; i++) {
			tempStack.push(inputStack.removeLast());
		}
		while (!tempStack.isEmpty()) {
			inputStack.push(tempStack.pollLast()); 
		}
		return inputStack;
	}
	
	public static void main(String[] args) {
		
		Deque<Character> inputStack = new ArrayDeque<Character>();
		inputStack.push('E');
		inputStack.push('D');
		inputStack.push('C');
		inputStack.push('B');
		inputStack.push('A');
		
		Deque<Character> resultStack = updateStack(inputStack);
		
		System.out.println("The alphabets in updated stack are:");
		for(Character alphabet: resultStack)
		    System.out.println(alphabet);
	}
	

}
