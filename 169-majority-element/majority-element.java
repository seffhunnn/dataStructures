class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length /2;

        HashMap<Integer,Integer> freqMap = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            freqMap.put(nums[i],freqMap.getOrDefault(nums[i],0)+1);
        }

        for(int i =0;i<nums.length;i++){
            if(freqMap.get(nums[i])>n)
            return nums[i];
        }
        
        return -1;
    }
}