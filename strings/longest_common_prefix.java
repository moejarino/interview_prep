class LCP {
    public static void main(String[] args)
    {
        String[] words = {"colorado", "color", "cold"};
        System.out.println(longestCommonPrefix(words));
    }


    public static String longestCommonPrefix(String[] words) {

        if (words.length == 0) return "";

        String prefix = words[0];

        for (int i = 1; i < words.length; i++) {
            while (words[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
        }

    }
