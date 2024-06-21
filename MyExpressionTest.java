package week5;

//NAME:  minhee kim
//ID #:  202070684
//MAIL:  minhee.kim@bellevuecollege.edu
//DATE:  2024 May 14

import java.util.Scanner;

public class MyExpressionTest {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     while (true) {
    	 
         System.out.printf("\nEnter a math expression: ");
         
      
         
         String expression = scanner.nextLine();

         if (expression.isEmpty()) {
             System.out.printf("\nBye!");
             break;
         }
         
         else {
             expressionEvaluation eval = new expressionEvaluation();
             boolean valid = eval.evaluateExpression(expression);
             if (valid) {
                 System.out.printf("%s is valid", expression);
               
             } 
         } 
     } 
 }
}

