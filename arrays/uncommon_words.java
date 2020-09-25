// Given two strings representing sentences, return the words that are not
// common to both strings (i.e. the words that only appear in one of the sentences).
// You may assume that each sentence is a sequence of words (without punctuation)
// correctly separated using space characters.
// https://helloacm.com/how-to-uncommon-words-from-two-sentences-in-java/
import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        String s = "the tortoise beat the haire";
        String t = "the tortoise lost to the haire";
        uncommonWords(s, t);

     }

     // Time O(n + m) | Space O(n + m) where n and m are the lengths of s and t
     public static String[] uncommonWords(String s,String t) {

        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (String word : s.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : t.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                result.add(word);
            }
        }
        System.out.println(Arrays.toString(result.toArray()));

        return result.toArray(new String[0]);

     }
}
