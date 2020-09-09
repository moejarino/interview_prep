import java.util.*;

class Vaccum {
    public static void main(String[] args)
    {
        String input = "UDLR";
        System.out.print(vacuumCleanerRoute(input));
    }

    //Time O(n) | Space O(n)
    public static boolean vacuumCleanerRoute(String str) {
        int x, y;
        x = y = 0;
        // turn string into char array
        char[] chars = str.toCharArray();

        // this solution will also work
        // for (int i = 0; i < str.length(); i++) {
        //     char move = chars[i];

        //     if (move == 'L')
        //         x -= 1;
        //     else if (move == 'R')
        //         x += 1;
        //     else if (move == 'U')
        //         y += 1;
        //     else
        //         y -= 1;
        // }

        //check every character and see what it matches
        for (char move : chars) {
            if (move == 'L')
                x -= 1;
            else if (move == 'R')
                x += 1;
            else if (move == 'U')
                y += 1;
            else
                y -= 1;
        }

        return x == 0 && y == 0;
    }

}

