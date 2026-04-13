class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();

        int t = nums.length/2;

        for(int i =0;i<nums.length;i++){
            freqMap.put(nums[i],freqMap.getOrDefault(nums[i],0)+1);
        }

        for(int i =0;i<nums.length;i++){
            if(freqMap.get(nums[i])>t)
            return nums[i];
        }
        return -1;

    }
}