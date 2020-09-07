import java.lang.*;
import java.io.*;
import java.util.*;

// Class of ReverseString
class ReverseString {
    public static void main(String[] args)
    {
        String input = "Geeks For Geeks";
        System.out.print(reversal(input));

    }

    public static String reversal(String s) {
        char[] rev = s.toCharArray();
        int begin = 0;
        int end = s.length() - 1;
        char temp;
        while (begin < end) {
            temp = rev[begin];
            rev[begin] = rev[end];
            rev[end] = temp;
            begin++;
            end--;
        }
        return new String(rev);
    }

}
