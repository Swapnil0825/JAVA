package Hashing_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding Elements
        map.put("Swapnil", 21);
        map.put("Devyani", 22);
        map.put("Harshal", 19);

        // Getting value of the key from the HashMap
        System.out.println(map.get("Swapnil"));
        System.out.println(map.get("Rahul"));

        // changing / updating the value of key in the HashMap
        map.put("Swapnil", 20);
        System.out.println(map.get("Swapnil"));

         // Remove pair from the HashMap
         map.remove("Swapnil");
         System.out.println(map.get("Swapnil"));
         System.out.println(map.remove("Rahul"));

         // checking if a key is in the HashMap
         System.out.println(map.containsKey("Swapnil"));
         System.out.println(map.containsKey("Devyani"));

         // adding the new entry only if the new key doesnt exit allready
         map.putIfAbsent("sai", 30);      // will enter 
         map.putIfAbsent("Devyani", 30); // Not enter

         // Getting all key in the HashMap
         System.out.println(map.keySet());

         // Getting all the value in the HashMap
         System.out.println(map.values());

         // Grtting all the entries from the HashMap
         System.out.println(map.entrySet());

         // Traversing all entries of HashMap - multiple method 
         System.out.println();

         for (String key : map.keySet()) {
            System.out.printf("Age of %s is %d \n",key,map.get(key));
            
         }

        System.out.println();

         for(Map.Entry<String , Integer> e : map.entrySet()){
            System.out.printf("Age of %s is %d \n",e.getKey(), e.getValue());

        }
         


        
    }
    
}
