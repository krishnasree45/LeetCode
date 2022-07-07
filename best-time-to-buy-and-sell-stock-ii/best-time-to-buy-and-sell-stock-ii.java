class Solution {
    public int maxProfit(int[] prices) {
        int i =0;
        int j = 0;
        int n = prices.length;
        int maxP = 0;
        while(j<n && i<n){
            if(j != n-1 && prices[j] < prices[j+1]){
               j++; 
            } else {
                maxP += prices[j] - prices[i];
                j = j+1;
                i = j;
            }
        }
        return maxP;
    }
}