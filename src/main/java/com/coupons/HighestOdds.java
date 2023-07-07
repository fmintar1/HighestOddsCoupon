package com.coupons;

import java.util.LinkedHashMap;
import java.util.Map;

public class HighestOdds {

    public static int highestProbability(int n) {
        int result = 1;
        int counter = 0;

        // Create a HashMap to create key-value pairs based on the numbers, sum of the digits, and repetitions
        Map <Integer, Integer> nMap = new LinkedHashMap<Integer, Integer>();

        // Create a loop to go through all numbers
        for (int i = 1; i <= n; i++) {
            int temp = i;

            // If numbers are higher than 9, it is added together using the method getDigitSum and store it in temp
            if (i > 9) {
                temp = GetDigitSum.getDigitSum(i);
            }

            // If key based on temp doesn't exist, set the value to 1, otherwise, increment the value
            if (!nMap.containsKey(temp)) {
                nMap.put(temp, 1);
            } else {
                nMap.put(temp, nMap.get(temp)+1);
            }
            
            // If the value is equal to counter, increment result
            if (nMap.get(temp) == counter) {
                result++;
            }

            // If the value is higher than counter, increase counter and reset the result back to 1
            if (nMap.get(temp) > counter) {
                System.out.println("counter is less than value");
                counter = nMap.get(temp);
                result = 1;
            }
        }
        return result;
    }
    
}
