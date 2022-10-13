class Solution {
    public int removeElement(int[] nums, int val) {
        int j = nums.length-1;
        int i =0;
        if(nums.length == 0)
            return 0;
        
        while(i <= j){
            if(nums[i] == val){
                
                while(j >= 0  && i != j && nums[j] == val)
                    j--;
                if(i == j)
                    return j;
                if(j == -1)
                    return 0;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            i++;
        }
        return i;
    }
}