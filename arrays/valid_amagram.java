import java.util.*;

// Given an array of integers, return whether or not two numbers sum to a given target, k.
// Note: you may not sum a number with itself.

class twosum {
    public static void main(String[] args)
    {
        int[] str1 = "";
        int str2 = "";
        twoSum(input, k);

    }
    //Time O(N | Space O(1)
    public static boolean validAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) return false;
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--;
        }

        for (int i : alphabet)
            if (i != 0) return false;

        return true;
    }

    //Time O(n log(n)) | Space O(N)
    public static boolean validAnagram(String str1, String str2) {

        // Get lenghts of both strings
        int n1 = str1.length();
        int n2 = str2.length();

        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++) {
            if (charArray1[i] != charArray2[i])
                return false;
        }

        return true;
    }
