class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] finalArr = new int[nums.length];
        int val = 1;
        for(int i=0; i< nums.length; i++){
            prefix[i] = val * nums[i];
            val = prefix[i];
        }
        val = 1;
        for(int i=nums.length-1; i>=0;i--){
            suffix[i] = val * nums[i];
            val = suffix[i];
        }
        finalArr[0] = suffix[1];
        finalArr[nums.length-1] = prefix[nums.length-2];
        for(int i= 1; i< nums.length-1; i++){
            finalArr[i] = prefix[i-1] * suffix[i+1];
        }
        return finalArr;
    }
}