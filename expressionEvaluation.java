package week5;

// NAME: Minhee Kim
// ID #:  202870684
// MAIL:  minhee.kim@bellevuecollege.edu
// DATE:  2024 May 14

import java.util.HashMap;
import java.util.Stack;

public class expressionEvaluation {
	
    HashMap<Integer, String> errorMessage = new HashMap<>();
    
    String statement;

    expressionEvaluation() {
    	
        errorMessage.put(0, "Incomplete Statement");
        errorMessage.put(1, ") expected");
        errorMessage.put(2, ") expected");
    }

    public boolean evaluateExpression(String statement) {
    	
        Stack<Character> stack = new Stack<>();
        this.statement = statement;
        boolean valid = true;

        for (int i = 0; i < statement.length(); i++) {
        	
            char c = statement.charAt(i);

            if (c == '(' || c == '{') {
            	
                stack.push(c);
            }

            if (c == ')') {
            	
                if (stack.isEmpty()) {
                	
                    printErrorMessage(i, 0);
                    valid = false;
                    break;
                }
                
                char poppedChar = stack.pop();
                
                if (!(poppedChar == '(')) {
                	
                    printErrorMessage(i, 1);
                    valid = false;
                    break;
                }
            }

            if (c == '}') {
            	
                if (stack.isEmpty()) {
                	
                    printErrorMessage(i, 0);
                    valid = false;
                    break;
                }
                
                char poppedChar = stack.pop();
                
                if (!(poppedChar == '{')) {
                    printErrorMessage(i, 2);
                }
                
                valid = false;
                break;
            }
        }

        if (!stack.isEmpty()) {
        	
            printErrorMessage(statement.length(), 0);
            
            valid = false;
        }
        return valid;
    }

    public void printErrorMessage(int location, int errorNumber) {
    	
        System.out.println(statement);
        
        for (int i = 0; i <= location - 1; i++) {
        	
            System.out.print(" ");
        }
        System.out.print("^ ");
        
        System.out.println(errorMessage.get(errorNumber));
    }
}
