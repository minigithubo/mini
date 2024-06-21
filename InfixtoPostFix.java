package week5;

import java.util.HashMap;
import java.util.Stack;

//NAME:  minhee kim
//ID #:  202070684
//MAIL:  minhee.kim@bellevuecollege.edu
//DATE:  2024 May 14

public class InfixtoPostFix {
	
	public String post = "";
	public static HashMap<Character, Integer> precedence = new HashMap<>();

	
	
	public String InfixtoPostFix(String infix) {
		
		loadPrecendence();
		
		Stack<Character>stack = new Stack<Character>();

	
	for(int j = 0; j<infix.length(); j++) {
		char c = infix.charAt(j);
		
		
		if(c >='0' && c <= '9') {
		
			post += c;
			
		
		}
		
		if(c=='(' || c=='{') {
			
			stack.push(c);			
			
		}
		
		
		if(c==')') {
			char p =' ';
			while(stack.peek()!='(') {
				 p = stack.pop();
				 post+=p;
			
			
			}
			p = stack.pop();
		}
		
		if(c=='}') {
			char p =' ';
			while(stack.peek()!='{') {
				 p = stack.pop();
				 post+=p;
			}
			p = stack.pop();
		}
	
	
	if( c == '+' || c == '-' || c == '*' || c == '/') {
		while(!stack.isEmpty() && (precedence.get(stack.peek()) >= precedence.get(c))) {
			char p = stack.pop();
			post+=p;
		}
		stack.push(c);
	
	
	}
	
	}
	while(!stack.isEmpty()) {
		char p = stack.pop();
		post += p;
	}


	return post;
		
}
	public static void loadPrecendence(){
		precedence.put('+', 1);
		precedence.put('-', 1);
		precedence.put('*', 2);
		precedence.put('/', 2);
		precedence.put('(', 0);
		precedence.put('{', 0);
		}

}