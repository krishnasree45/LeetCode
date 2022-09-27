class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i = 0; i<= n; i++){
            res[i] = countBitsOfNum(i);
        }
        return res;
    }
    
    private int countBitsOfNum(int i){
        
        int ones = 0;
        while(i > 0){
            ones = ones + (i & 1);
            i = i>>1;
        }
        return ones;
    }
}