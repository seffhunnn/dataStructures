class Solution {
    public int maxFrequencyElements(int[] nums) {

        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            freqMap.put(nums[i],freqMap.getOrDefault(nums[i],0)+1);
        }
        int maxFreq = 0;
        for(int freq: freqMap.values()){
            if(freq>maxFreq) maxFreq = freq;
            
        }
        int count =0;
        for(int freq:freqMap.values()){
            if(freq==maxFreq) count++;
        }

        return maxFreq * count;
    }
}