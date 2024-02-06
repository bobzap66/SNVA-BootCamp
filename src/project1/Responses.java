package project1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Responses {
	HashMap<String, String> possibleResponses;
	HashMap<String, List<String>> meals;
	ArrayList<String> types = new ArrayList<String> ();
	ArrayList<String> inputs = new ArrayList<String> ();
	
	
	
	
	public Responses() {
		super();
		possibleResponses = new HashMap<String,String> ();
		meals = new HashMap<String, List<String>> ();
		meals = aggregateByKeys("./src/project1/MealMap.txt");
		possibleResponses = byBufferedReader("./src/project1/responses.txt");
		types.addAll(meals.keySet());
		inputs.addAll(meals.keySet());
	}

	public static HashMap<String, String> byBufferedReader(String filePath) {
	    HashMap<String, String> map = new HashMap<>();
	    String line;
	    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	        try {
				while ((line = reader.readLine()) != null) {
				    String[] keyValuePair = line.split(":", 2);
				    if (keyValuePair.length > 1) {
				        String key = keyValuePair[0];
				        String value = keyValuePair[1];
				        map.putIfAbsent(key, value);
				        }
				    }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        } catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

	    return map;
	}

	public HashMap<String, List<String>> aggregateByKeys(String filePath) {
		HashMap<String, List<String>> map = new HashMap<String, List<String>> ();
	    try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
	        lines.filter(line -> line.contains(":"))
	          .forEach(line -> {
	              String[] keyValuePair = line.split(":", 2);
	              String key = keyValuePair[0];
	              String value = keyValuePair[1];
	              if (map.containsKey(key)) {
	            	  map.get(key).add(value);
	              } else {
	            	  map.put(key, Stream.of(value).collect(Collectors.toList()));
	              }
	          });
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return map;
	}
	
	public String randomResponse(List<String> list) {
	    Random rand = new Random();
	    String response = list.get(rand.nextInt(list.size()));
		return response + ". If that doesn't work, retype your keyword";
	}
	
	public String getKeyword(ArrayList<String> inputList){
		for(int i = 0;  i < inputList.size(); i++) {
			if(possibleResponses.get(inputList.get(i)) != null) {
				return possibleResponses.get(inputList.get(i));
				
			}
		}
		for(int i = 0;  i < inputList.size(); i++) {
			if(meals.get(inputList.get(i)) != null) {
				return "You should have " + randomResponse(meals.get(inputList.get(i))) + ".";
			}
		}
		
		
		return possibleResponses.get("default");
	}
	
}
