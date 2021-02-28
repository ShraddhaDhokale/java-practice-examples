package javaQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DupicateStringsInArray {

	public static void main(String[] args) {
		String names[] = {"Java", "Javascript", "python", "C", "Ruby", "Java"};
		
		//1. using nested for loop
		for (int i=0; i<names.length; i++){
			for (int j=i+1; j<names.length; j++){
				if(names[i].equals(names[j])){
					System.out.println("duplicate value is::"+names[i]);
				}
			}
		}
		
		System.out.println("*****************");
		
		//2. using HashSet
		Set<String> store = new HashSet<String>();
		for (String name: names){
			if (store.add(name) == false){
				System.out.println("duplicate value is::"+name);
			}
		}
		
		System.out.println("******************");
		
		//3. using HashMap
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		
		for (String name: names){
			Integer count = storeMap.get(name);
			if (count == null){
				storeMap.put(name, 1);
			}else{
				storeMap.put(name, ++count);
			}
		}
		
		//get values from the map
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for (Entry<String, Integer> entry: entrySet){
			if (entry.getValue() > 1){
				System.out.println("duplicate value is::"+entry.getKey());
			}
		}
		
		
	}

}
