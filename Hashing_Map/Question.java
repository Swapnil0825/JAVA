// 1 3 2 1 4 1
package Hashing_Map;

import java.util.Scanner;
import java.util.HashMap;

public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int n = sc.nextInt();

        System.out.println("Enter the Element of the array");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // for(int el : arr) {
        //     if(!map.containsKey(el)){
        //         map.put(el, 1);
        //     } else {
        //         map.put(el, map.get(el) + 1);
        //     }
        // }

        // System.out.println(map.entrySet());
        
        for (int i = 0; i < n; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]) + 1 );
            } else {
                map.put(arr[i], 1);
            } 
        }
           System.out.println(map.entrySet()); 


           
    }
}
