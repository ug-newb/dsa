package org.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
    --------------------Main Code----------------------------
        lc_151_opt ob = new lc_151_opt();
        String s = "Helo world me";
        System.out.println(ob.reverseWords(s));

        */

public class lc_151_optimized {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        List<int[]> wordPositions = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == ' ') i++;
            if (i == s.length()) break;
            int start = i;
            while(i < s.length() && s.charAt(i) != ' ') i++;
            int end = i - 1;
            wordPositions.add(new int[] {start , end});
        }
        for (int j = wordPositions.size() - 1; j >= 0; --j) {
            // Extract the word using substring
            String word = s.substring(wordPositions.get(j)[0], wordPositions.get(j)[1] + 1);
            result.append(word);
            // Add a space between words, except for the last word
            if (j != 0) result.append(" ");
        }

        return result.toString();
    }
}