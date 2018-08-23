class Solution {
    public int rob(int[] nums) {
        if(nums.length ==0)
            return 0;
        if(nums.length ==1)
            return nums[0];
        int n= nums.length;
        int[] result = new int[n];
        result[n-1] = nums[n-1];
        result[n-2] = Math.max(nums[n-1],nums[n-2]);
        for(int i= n-3;i>=0;i--){
            result[i] = Math.max(nums[i]+result[i+2],result[i+1]);
        }
        return result[0];
    }
    
}
