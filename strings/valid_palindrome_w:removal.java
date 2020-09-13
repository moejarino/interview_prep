// Given a string and the ability to delete at most one character,
// return whether or not it can form a palindrome.

import java.util.*;

class Palindrome {
    public static void main(String[] args)
    {
        String input = "abcba";
        System.out.print(validPalindromeRemoval(input));
    }

    //Time O(N) | Space O(N)
    public static boolean validPalindromeRemoval(String str) {

        int l = 0;
        int r = str.length()-1;

        while(l < r) {

            char leftChar = str.charAt(l);
            char rightChar = str.charAt(r);

            if (leftChar == rightChar) {
                l++;
                r--;
            } else {
                if (isPalindrome(str, l+1, r))
                    return true;
                else if (isPalindrome(str, l, r-1))
                    return true;
                else
                    return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String str, int left, int right) {

        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
