package org.leetcode;

import java.util.HashMap;
/*----------------MAIN CODE-------------------------------------
* public static void main(String[] args) {
        lc_560 ob = new lc_560();
        int[] nums = {3,1,2,4};
        int k = 6;
        System.out.println(ob.subarraySum(nums,k));
    }
* */
public class lc_560 {
    public int subarraySum(int[] nums, int k) {
        int result = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 1);
        int preSum = 0;
        for(int i=0; i<nums.length; i++) {
            preSum = preSum + nums[i];
            result += hashMap.getOrDefault(preSum - k, 0);
            hashMap.put(preSum , hashMap.getOrDefault(preSum, 0) + 1);
        }
        for(int i:  hashMap.keySet()) {
            System.out.println(i + " " + hashMap.get(i));
        }

        return result;
    }
}
