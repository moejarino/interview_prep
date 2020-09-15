// Given a string representing your stones and another string representing a l
// ist of jewels, return the number of stones that you have that are also jewels.


import java.util.*;
import java.lang.*;
import java.io.*;

class Jewel {
    public static void main(String[] args)
    {
        String jewels = "Af";
        String stones = "AaaddfFf";
        System.out.println(jewelStones(stones, jewels));
    }
    // Time O(JS) | Space O(S)
    public static int jewelStones(String stones, String jewels) {
        HashMap<Character, Integer> stoneFreq = new HashMap<>();
        int total = 0;
        char[] stoneChar = stones.toCharArray();
        char[] jewelChar = jewels.toCharArray();

        for (int i = 0; i < stones.length(); i++) {
            Character stone = stoneChar[i];
            if (stoneFreq.containsKey(stone)) {
                stoneFreq.replace(stone, stoneFreq.get(stone)+1);
            } else {
                stoneFreq.put(stone, 1);
            }
        }
        for (int i = 0; i < jewels.length(); i++) {
            Character jewel = jewelChar[i];
            if (stoneFreq.containsKey(jewel))
                total += stoneFreq.get(jewel);
        }
        return total;

    }
}
