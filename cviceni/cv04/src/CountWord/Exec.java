package CountWord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class Exec {

	public static void main(String[] args) throws IOException {
		 
		 String text = null;
			TreeMap<String , Integer> tree_map = new TreeMap<String, Integer>();
			

			
			// Passing the path to the file as a parameter
			BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
			
			
	        // Declaring loop variable
	        // Holds true till there is nothing to read
			String line = reader.readLine();
	        while (line != null) {
	        	System.out.println(line);
	        	String [] words = line.split(" ");
	        	for (String word : words) {
	        	    Integer count = tree_map.get(word);
	        	    if (count == null) {
	        	    	tree_map.put(word, 1);
	        	    	
	        	    } else {
						tree_map.put(word, count + 1);
					}
	        	            
				}
	        line = reader.readLine();
	        }
		System.out.println(tree_map.toString());
	}

}
