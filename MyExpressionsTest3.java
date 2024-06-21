package week5;

import java.util.Scanner;

public class MyExpressionsTest3 {
	
	static Scanner scanner = new Scanner(System.in);
	static String infix;
	static String postfix;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	while (true) {
			System.out.printf("\nEnter a postfix: ");
			postfix=scanner.nextLine();
		
		if (postfix.length()==0) {
			
			System.out.printf("\nBye!");
			break;
		}
		
		else {
			
			postfixEvaluation pe = new postfixEvaluation();
			
			int result = pe.postfixEvaluation1(postfix);
			
			System.out.println("postfix: " + postfix);
			
			System.out.println("result: " + result);
		}
		} 
		} 
	}


