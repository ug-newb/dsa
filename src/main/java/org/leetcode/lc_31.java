package org.leetcode;
/*------------------------MAIN CODE---------------------------------------
* public static void main(String[] args) {
        lc_31 ob = new lc_31();
        int[] arr = {1, 1, 5};
        ob.nextPermutation(arr);
    }
* */
public class lc_31 {
    public void nextPermutation(int[] nums) {
        int k = -1, l = -1;
        for(int i=0; i<nums.length - 1; i++) {
            if(nums[i] < nums[i+1])
                k = i;
        }
        if(k == -1) {
            reverse(nums, 0, nums.length - 1);
        } else {
            for(int i=0; i<nums.length; i++) {
                if(nums[k] < nums[i])
                    l = i;
            }
            swap(nums, k, l);
            reverse(nums, k+1, nums.length - 1);
        }

        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void reverse(int[] arr, int start, int end) {
        while(start < end) {
            swap(arr ,start, end);
            start++;
            end--;
        }
    }
}
