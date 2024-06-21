package week3_1;

//explanation: The Weather211 class fetches the current temperature of a given city.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.DecimalFormat;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class Weather211 {

	public static double CityWeather (String cityName) throws Exception {	

		double cityTemp = 0.0;
	
				
		try {								
				String firstPartURL = "https://api.openweathermap.org/data/2.5/weather?q=";
				
				String secondPartURL ="&appid=31bd510c3ff6a77eb9d5a8eef99f5ef9"; 
				
				String theURL = firstPartURL + cityName + secondPartURL;
				
				URL url = new URL(theURL); 
				
				///Reads information from URL    
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				
				//JSON parser object to parse read file
				JSONParser jsonParser = new JSONParser();
				//Read JSON file. All the data for the city is stored in "jsonObj"
				JSONObject myObject = (JSONObject)jsonParser.parse(br);	 						    		    
		    			  
				 cityTemp = (double)((JSONObject) myObject.get("main")).get("temp");
				 
				 System.out.println(cityTemp);
			
				
				
		      }
		 
		   catch (Exception ex) {	
			   
			  
		   }
	return ((cityTemp-273.15)*1.8+32);
			     
	}
	
	
	
	
}