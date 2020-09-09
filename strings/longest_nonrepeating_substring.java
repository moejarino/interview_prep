import java.util.*;

class Substring {
    public static void main(String[] args)
    {
        String input = "abcdabca";
        System.out.print(lengthOfLongestSubstring(input));
    }

    // Time O(n) | Space O(n)
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        String longest = "";

        HashSet<Character> visited = new HashSet();
        // before the right pointer reaches the end
        while (right < s.length()){
            //if we havent seen the character, add it to visited
            if (!visited.contains(s.charAt(right))){
                visited.add(s.charAt(right));
                right++;
                //if substring is longer than longest seen so far, update it
                if ((right+1-left) > longest.length())
                    longest = s.substring(left, right);
            //we have seen this, restart by removing it from visited and moving left pointer
            } else {
                visited.remove(s.charAt(left));
                left++;
            }
        }
        return longest.length();
    }
}
