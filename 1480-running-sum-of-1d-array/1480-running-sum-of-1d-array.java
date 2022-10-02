class Solution {
    public int[] runningSum(int[] nums) {
        int[] finalRes = new int[nums.length ];
        int sum = 0;
        for(int i = 0; i< nums.length; i++){
            finalRes[i] = sum + nums[i];
            sum = finalRes[i];
        }
        return finalRes;
    }
}