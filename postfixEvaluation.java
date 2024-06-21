package week5;

//NAME:  minhee kim
//ID #:  202070684
//MAIL:  minhee.kim@bellevuecollege.edu
//DATE:  2024 May 14
import java.util.Scanner;
import java.util.Stack;

public class postfixEvaluation {
	
	public int postfixEvaluation1(String postfix) {
	 
	 Stack<Integer>stack = new Stack<Integer>();
	 
		Scanner scanner = new Scanner(postfix);
	

	while(scanner.hasNext()) {
		
		if (scanner.hasNextInt()) {
			
		stack.push(scanner.nextInt());	
		
		}else { 
			
		
		String token = scanner.next();
		
		int value1 = stack.pop();
		
		int value2 = stack.pop();
		
		if(token.equals("+")) {
			stack.push(value1 + value2);
		}
		
		if(token.equals("-")) {
			stack.push(value1 - value2);
		}
		
		if(token.equals("*")) {
			stack.push(value1 * value2);
		}
		
		if(token.equals("/")) {
			stack.push(value1 / value2);
		}
		
		}
	}
	
	if(!stack.isEmpty()) {
	}

	return stack.pop();
   }
}

