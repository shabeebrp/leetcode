class Solution {
    public int dominantIndex(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int index = 0;
        if(nums.length ==1)
            return 0;
        for(int i = 0;i<nums.length;i++){
            int num = nums[i];
            if(num>largest){
                secondLargest = largest; largest = num; index = i;
            }
            else if(num>secondLargest)
                secondLargest = num;
        }
        return secondLargest*2<=largest?index:-1;
    }
}
