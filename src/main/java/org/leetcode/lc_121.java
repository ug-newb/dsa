package org.leetcode;
/*public static void main(String[] args) {
        lc_121 ob = new lc_121();
        int[] prices = {2,4,1};
        System.out.println(ob.maxProfit(prices));
    }*/
public class lc_121 {
    public int maxProfit(int[] prices) {
        int smallest = Integer.MAX_VALUE;
        int profit_today = 0;
        int total_profit = 0;
        for(int i=0; i<prices.length; i++) {
            if(smallest > prices[i]) {
                smallest = prices[i];
            }
            profit_today = prices[i] - smallest;
            if(total_profit < profit_today) {
                total_profit = profit_today;
            }
        }
        return total_profit;
    }
}
