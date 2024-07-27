package org.example;
import org.leetcode.lc_1;
class Main {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println("hello");
        lc_1 ob = new lc_1();
        int[] res = ob.twoSum(nums, target);
        for(int i=0; i< res.length; i++) {
            System.out.print(res[i] +" ");
        }
    }
}
