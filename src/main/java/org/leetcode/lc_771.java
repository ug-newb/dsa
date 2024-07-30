package org.leetcode;
/*
* public static void main(String[] args) {
        String jewels = "z";
        String stones = "ZZ";
        lc_771 ob = new lc_771();
        System.out.println(ob.numJewelsInStones(jewels, stones));
    }*/
public class lc_771 {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        int i = 0;
        for(char c: stones.toCharArray()) {
            if(jewels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
