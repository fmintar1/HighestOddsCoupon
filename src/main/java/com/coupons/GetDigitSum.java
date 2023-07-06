package com.coupons;

public class GetDigitSum {
    
    // Function to calculate the sum of digits in a number
    public static int getDigitSum(int num) {
        int sum = 0;

        // While num is higher than 10, return all remainders after repeatedly dividing num by 10 and return the sum
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
