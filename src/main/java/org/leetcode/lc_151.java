package org.leetcode;

/*s = "This is a String"
  result = "String a is This"



  --------------------Main Code----------------------------
  lc_151 ob = new lc_151();
        String s = "This is my     home";
        System.out.println(ob.reverseWords(s));
* */
public class lc_151 {
    public String reverseWords(String s) {
        String result = new String();
        int N = s.length();
        int i = 0;
        int j = 0;
        while(i < N && s.charAt(i) == ' ') {
            i++;
        }
        while(i < N) {
            j = i;
            while (j < N  && s.charAt(j) != ' ') {
                j++;
            }
            String word = s.substring(i, j);
            if (result.isEmpty()) {
                result = word;
            } else {
                result = word + " " + result;
            }
            i = j + 1;
            while(i < N && s.charAt(i) == ' ') {
                i++;
            }
        }
        return result;
    }
}
