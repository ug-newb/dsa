package org.example;
import org.leetcode.lc_2461;
class Main {
    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;
        lc_2461 ob = new lc_2461();
        System.out.println(ob.maximumSubarraySum(nums, k));
    }
}
