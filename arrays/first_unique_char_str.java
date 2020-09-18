 import java.util.*;

// This question is asked by Microsoft. Given a string, return the index of its first unique character. If a unique character does not exist, return -1.

public class program {
    public static void main(String[] args)
    {
        String str = "bbbb";

        System.out.println(uniqueChar(str));

    }

    //Time O(2n) | Space O(n)
    public static int uniqueChar(String str) {

        HashMap<Character, Integer> count = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if (count.containsKey(letter))
                count.put(letter, count.get(letter) + 1);
            else
                count.put(letter, 1);
        }

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if (count.get(letter) == 1)
                return str.indexOf(letter);
        }

        return -1;

    }
}
