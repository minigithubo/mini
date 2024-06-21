package week3_1;

//explanation: The Menu class extends Burger211 and includes 
//additional functionalities like setting promotions,
//updating burger toppings, and printing the menu with localized prices.

	import java.text.DecimalFormat;
	import java.util.Currency;
	import java.util.Locale;

	public class Menu extends Burger211 {

		
		String country;
		String franchise;
		double discountRate;
		String promotion;
		String currencyCode;
		String currencySymbol;
		int updatedBurgerKey=-1;
		String updatedTopping;
		double discountPrice;
		
		
		static double exchangeRate;
		static double temperature; 
	

		  String [] localPrice = new String [getHowManyBurgers()+1]; 
		  
		  String [] localOriginalPrice = new String[getHowManyBurgers()+1];
				 
		  String pro="";	
		  
		  
		  Menu(String country, String franchise) throws Exception{	
			    
			  Locale locale = new Locale.Builder().setRegion(country).build();
			  
			  currencyCode = Currency.getInstance(locale).getCurrencyCode();
			  
			  currencySymbol = Currency.getInstance(locale).getSymbol();
			  		  	  
			   this.country=country;
			   
			   this.franchise=franchise;
		   
		  
		  
		  ExchangeRate exr = new ExchangeRate();
		  
		  exchangeRate = exr.getRate(currencyCode);
		  
		  for(int i = 1; i<= getBurger().size(); i++) {
			  
			  double price =  getBurger().get(i).price * exchangeRate;
			  localPrice[i] = String.format("%.2f",price);
			  localOriginalPrice[i] = String.format("%.2f",price);
		  }
		  
		  Weather211 wth = new Weather211();
		  temperature = wth.CityWeather(franchise);
		  
		 }
		 
		  public void updateTopping(int burgerNumber, String newTopping) {
			  
			  getBurger().get(burgerNumber).topping = newTopping;
			
		  }
		  
		  
		  public void Promotion(double discountRate, String promotion) {
			  
			  
			  this.promotion = promotion;
			  
			  for(int i =1; i<= getBurger().size(); i++) {
				  
				  discountPrice = getBurger().get(i).price;
				  discountPrice = discountPrice - (discountPrice * discountRate);
				  discountPrice = discountPrice * exchangeRate;
				  localPrice[i] = String.format("%.2f",discountPrice) + "(regular: "+ localOriginalPrice[i]+ ") ";

			  }
			  
			  
			  
			  for(int i= 1; i<=getBurger().size(); i++) {
				  		  
				  double price =  getBurger().get(i).price;
				  
				  price = price-(price*discountRate);
			  
			  }
			  
		  }
		  
		  
		  public void PromotionTooHot(int tooHot) {
			  
			 if(temperature >= tooHot ) {
			  
			  for(int i = 1; i<=getBurger().size(); i++) {
				  
				  double price =  getBurger().get(i).price;
				  
				  price = price-(price* 0.1);
			  }
				 
			 }
			 
		 }
		  
		  
		  public void printMenu() {
		  
		  
		  				 
		   new MenuGUI(franchise,promotion,
				   getName(1), currencySymbol+localPrice[1],getTopping(1),
				   getName(2),currencySymbol+localPrice[2], getTopping(2),
				   getName(3),currencySymbol+localPrice[3], getTopping(3),
				   exchangeRate, temperature);
		
		  }
		 
	

	}



