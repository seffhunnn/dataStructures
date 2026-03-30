class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k <= 1) return 0;  
        
        int count =0;
        int left = 0;
        int currProd=1;

        for(int right =0;right<nums.length;right++){  //sliding window
            currProd*=nums[right];

            while(currProd>=k){
            currProd/=nums[left];
            left++;
                
            }
            count += right-left+1;
        }
        
        return count;
    }
}