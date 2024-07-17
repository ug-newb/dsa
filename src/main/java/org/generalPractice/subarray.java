package org.generalPractice;

public class subarray {
    public void subarrays() {
        int[] arr = {1, 2, 3};
        for(int i=0; i<arr.length; i++) {
            for(int j = i; j<arr.length; j++) {
                for(int k = i; k<=j; k++)
                    System.out.print(arr[k] + " ");
                System.out.println();
            }
        }
    }
}
