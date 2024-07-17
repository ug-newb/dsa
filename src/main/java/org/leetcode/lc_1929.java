package org.leetcode;

public class lc_1929 {
    /*--------------------Main Code----------------------------
    int nums[] = {1,2,1};
        lc_1929 n = new lc_1929();
        int ans[] = new int[nums.length];
        ans = n.getConcatenation(nums);
        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    */
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0; i<nums.length; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
