package org.leetcode;

import java.util.HashMap;

/*---------------------MAIN CODE----------------------
public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        lc_1 ob = new lc_1();
        int[] res = ob.twoSum(nums, target);
        for(int i=0; i< res.length; i++) {
            System.out.print(res[i] +" ");
        }
    }
* */

public class lc_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return new int[] {};
    }
}
/*NAUGHTY SOLUTION
* for(int i=0; i<nums.length; i++) {
            for(int j=i; j< nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    break;
                }
            }
        }*/