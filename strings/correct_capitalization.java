import java.util.*;

//Given a string, return whether or not it uses capitalization correctly.
//A string correctly uses capitalization if all letters are capitalized,
//no letters are capitalized, or only the first letter is capitalized.

class Capitalization {
    public static void main(String[] args)
    {
        String input = "coding";
        System.out.print(correctCapitalization(input));
    }

    //Time O(N) | Space O(1)
    public static boolean correctCapitalization(String str) {

        if (str.toUpperCase() == str)
            return true;

        for(int i = 1; i <str.length(); i++) {
            if (str.charAt(i) >= 97)
                continue;
            else
                return false;
        }

        return true;

    }

}
