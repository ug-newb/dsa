package org.generalPractice;

public class equilibrium_array_index {
    public int equilibrium_index(int[] a) {
        int total_sum = 0;
        int left_sum = 0;
        int ans = -1;
        for(int i=0; i<a.length; i++) {
            total_sum += a[i];
        }
        for(int i=0; i<a.length; i++) {
            total_sum = total_sum - a[i];
            if(left_sum == total_sum) {
                ans = i;
            }
            left_sum += a[i];
        }
        return ans;
    }
}

/*
--------------------------------MAIN CODE-------------------------------------------
        public static void main(String[] args) {
        equilibrium_array_index ob = new equilibrium_array_index();
        int arr[] = {3,1,-3424,2,2};
        System.out.println(ob.equilibrium_index(arr));
    }


*------------First Attempt code(Partially correct to fool me if I interview------------
* int target_index = 0;
        int sum = 0;
        for(int i=0; i<a.length; i++) {
            sum += a[i];
        }
        int max_sum_each = sum/2;  //NOTE: This works fine for arrays where the element at the
        int arraySum = sum;        //equilibrium index is positive, this code doesn't work if the
        sum = 0;                    //element is negative..
        for(int i=0; i<a.length; i++) {
            sum += a[i];
            if(sum == max_sum_each) {
                target_index = i+1;
                break;
            }
            else if(sum > max_sum_each) {
                target_index = i;
                break;
            }
        }
        int upto_ti_sum = 0;
        int from_ti_sum = 0;
        for(int i=0; i<target_index; i++) {
            upto_ti_sum += a[i];
        }
        from_ti_sum = arraySum - a[target_index] - upto_ti_sum;
        if(from_ti_sum == upto_ti_sum) {
            return target_index;
        }
        else
            return -1;
* */