package org.howard.edu.lsp.assignment2;


import java.io.IOException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;




public class WordCounting {

	public static void main(String[] args) throws IOException {
		//Use hashmap to store words
		HashMap<String, Integer> mapFrequency = new HashMap<String, Integer>();
		
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
				
		
		//Use Scanner class to read a file 
		String file = "src/org/howard/edu/lsp/assignment2/words.txt";
		Scanner scanner = new Scanner(new File(file));
	
		
		while(scanner.hasNext()){
			String word = scanner.next();
			word = word.toLowerCase();
			word = word.replaceAll("[^a-zA-Z]", "");
			word = word.replaceAll("\\b\\w{1,3}\\b\\s?", "");
		
			
			if (mapFrequency.containsKey(word)) {
				//increase count by 1 if word already exist 
				int count = mapFrequency.get(word) + 1;
				mapFrequency.put(word, count);
				
	
			}
			else {
				mapFrequency.put(word,  1);
			}
		}
		scanner.close();
		for (Map.Entry<String, Integer> entry : mapFrequency.entrySet()) {
			System.out.println(entry);
			
		}


	}
}
		