import java.util.*;

class Program {

    public static void main(String[] args)
    {
        String input = "abaxyzzyxf";
        System.out.print(longestPalindromicSubstring(input));
    }

    public static String longestPalindromicSubstring(String str) {
        int[] currentLongest = {0, 1};
        for(int i = 0; i < str.length(); i++) {
            int[] odd = expandFromMiddle(str, i, i);
            int[] even = expandFromMiddle(str, i, i+1);
            int[] longest = odd[1] - odd[0] > even[1] - even[0] ?
                odd : even;
            currentLongest = longest[1] - longest[0] > currentLongest[1] - currentLongest[0] ?
                longest : currentLongest;
        }
            return str.substring(currentLongest[0], currentLongest[1]);
  }

    public static int[] expandFromMiddle(String str, int left, int right) {
        while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
    return new int[] {left + 1, right};
    }

    public static String longestPalindromicSubstring(String str) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < str.length(); i++) {
            int odd = expandFromMiddle(str, i, i);
            int even = expandFromMiddle(str, i, i+1);
            int longest = Math.max(odd, even);
            if (longest > end - start){
                start = i - ((longest-1) / 2);
                end = i + (longest / 2);
            }
        }
        return str.substring(start, end+1);
    }

    public static int expandFromMiddle(String str, int left, int right){
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }
    return right - left - 1;
    }

}
