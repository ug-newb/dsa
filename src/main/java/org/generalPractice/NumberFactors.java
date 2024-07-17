package org.generalPractice;

import java.util.ArrayList;

public class NumberFactors {
    public void Factors(int n) {
        ArrayList<Integer> ll= new ArrayList<Integer>();
        for(int i=1; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                ll.add(i);
                if(i != Math.sqrt(n)) {
                    ll.add(n/i);
                }
            }
        }
        //int[] sorted = Arrays.sort(ll.toArray());
        for(int item: ll) {
            System.out.print(item + " ");
        }
    }
}
