class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left=0;
        int currSum =0;
        int min = Integer.MAX_VALUE;

        for(int right = 0;right<nums.length;right++){
            currSum+= nums[right];

            while(currSum>=target){
                int currWin= right-left+1;
                min= Math.min(min,currWin);
                currSum-=nums[left];
                left++;
            }
        }

        if(min==Integer.MAX_VALUE) return 0;
        return min;
        
    }
}