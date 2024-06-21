package week3_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//Explanation: The ExchangeRate class fetches the current exchange rate for a given currency code.

public class ExchangeRate {


	static double rate=1.0;
	static JSONObject myObject;
	
	public static double getRate(String currancyCode){	
		
		try {
		String firstPartURL = " https://v6.exchangerate-api.com/v6/";
		String secondPartURL ="19e6c26a2c2f0cd412eb1c44";
		String URL_END = "/latest/USD";
		String theURL = firstPartURL + secondPartURL + URL_END;
		
		URL url = new URL(theURL);
		
		   BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		   
           JSONParser parser = new JSONParser();
           
           JSONObject allExchangeRate = (JSONObject) parser.parse(reader);
           
           JSONObject aa = (JSONObject) allExchangeRate.get("conversion_rates");
           
           rate = (double) aa.get(currancyCode);
           
         
           
	
	}catch(Exception ex){
   		 
   		 System.out.println(rate);
   	
   	 }
	
		return rate;
	}
}