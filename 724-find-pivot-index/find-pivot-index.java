class Solution {
    public int pivotIndex(int[] nums) {

        int totalSum =0;
        for(int i =0;i<nums.length;i++){
            totalSum += nums[i];
        }
        
        int leftSum = 0;
        int rightSum =0;
        int equi = -1;

        for(int i =0;i<nums.length;i++){
            rightSum = totalSum - leftSum - nums[i];

            if(rightSum == leftSum){
                equi = i;
                break;
            }
            leftSum += nums[i];
        }
        return equi;
        
    }
}