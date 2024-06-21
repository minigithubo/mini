package week5;

//NAME:  minhee kim
//ID #:  202070684
//MAIL:  minhee.kim@bellevuecollege.edu
//DATE:  2024 May 14

import java.util.Scanner;
public class MyExpressionTest2 {
	
	static Scanner input = new Scanner(System.in);
	static String infix;
	static String postfix;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	while (true) {
			
			System.out.printf("\nEnter a math expression: ");
		
			String mathExpression=input.nextLine();
		
		if (mathExpression.length()==0) {
			
			System.out.printf("\nBye!");
			
			break;
		
		}
		if(!expressionEvaluation1)
		
		else {
			
			InfixtoPostFix i2p = new InfixtoPostFix();
			
			postfix = i2p.InfixtoPostFix(mathExpression);
		
			System.out.println("infix: " + mathExpression);
		
			System.out.println("postfix: " + postfix);
		
		} 
		
		} 
	} 
		

	}


