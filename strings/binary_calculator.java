// Given two binary strings (strings containing only 1s and 0s) return their sum (also as a binary string).
// Note: neither binary string will contain leading 0s unless the string itself is 0

import java.util.*;
import java.lang.Math;

class Binary {
    public static void main(String[] args)
    {
        String num1 = "1010";
        String num2 = "1010";
        System.out.print(binaryAddition(num1, num2));
    }


    public static String binaryAddition(String bin1, String bin2) {

        int num1 = 0;
        int num2 = 0;

        for(int i = bin1.length()-1; i >= 0; i--){
            if (bin1.charAt(i) == 49) {
                num1 += Math.pow(2, bin1.length()-1-i);
            }
        }

        for(int i = bin2.length()-1; i >= 0; i--){
            if (bin2.charAt(i) == 49)
                num2 += Math.pow(2, bin2.length()-1-i);
        }

        return Integer.toBinaryString(num1 + num2);
    }
}

