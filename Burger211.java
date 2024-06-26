package week3_1;

import java.util.ArrayList;
import java.util.HashMap;

//explanation: The Burger211 class serves as an abstract base class for creating burger menus. 
//It includes methods to access burger details and an abstract method to print the menu.
public abstract class Burger211{

	private static HashMap <Integer, BurgerInfo> burger = new HashMap <> ();
	
	  Burger211(){   
		  
		 burger.put(1, new BurgerInfo("Inheritance Burger", 4.5, "beef patty, tomato, onion, black olive, ranch sauce")); 
		 burger.put(2, new BurgerInfo("@Override Burger", 5.5, "beef patty, lime, onion, lettuce, tomato sauce"));
		 burger.put(3, new BurgerInfo("Polymorphism Burger", 6.5, "chicken breast, gallo, onion, ranch sauce"));	 		 
	  }	  
	  
	  HashMap<Integer, BurgerInfo>getBurger(){
		  
		  return burger;
	  }
	  
	  public int getHowManyBurgers() {
		  
		  return burger.size();
	  }
	  
	  public String getName(int i) {
		  
		  return burger.get(i).name;
	  }
	  
	  public double localPrice(int i) {
		  
		  return burger.get(i).price;
	  }
	  
	  public String getTopping(int i) {
		  
		  return burger.get(i).topping;
	  }
		
	  abstract void printMenu();    
	
	 
	  
	  
}
