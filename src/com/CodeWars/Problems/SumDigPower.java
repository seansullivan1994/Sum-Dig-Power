package com.CodeWars.Problems;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {
    public static List<Long> sumDigPow(long a, long b) {
        //List of values from given range
        List<Long> eureka = new ArrayList<Long>();
        long end = b;
        String number ="";
        String[] digits = new String[]{};
        long total = 0;
        //loop through the range given
        for(long start = a; start <= end; start++)
        {
            //Turn the current value to a string
            number = Long.toString(start);
            //split current value in string form into individual digits
            digits = number.split("(?<=.)");
            //for the number of digits do a summation of digits^incrementing Exponential
            for(int exponential = 0; exponential < digits.length; exponential++){
                total += (long)Math.pow(Long.parseLong(digits[exponential]),(exponential+1));
            }
            if(total==start){
                eureka.add(start);
            }
            digits = new String[]{};
            total = 0;
        }
        return eureka;
    }
}
