package org.leetcode;

/*
* int[] nums = {5,4,3,2,1};
        lc_334 ob = new lc_334();
        System.out.println(ob.increasingTriplet(nums));*/

public class lc_334 {
    public boolean increasingTriplet(int[] nums) {
        int num1 = Integer.MAX_VALUE;
        int num2 = Integer.MAX_VALUE;
        for(int num: nums) {
            if(num <= num1) {
                num1 = num;
            } else if(num <= num2) {
                num2 = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
