class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] arr3 = new int[nums1.length+nums2.length];
        int k =0;

        for(int i =0;i<nums1.length;i++){
            arr3[k++] = nums1[i];
        }
        for(int i =0;i<nums2.length;i++){
            arr3[k++] = nums2[i];
        }

        Arrays.sort(arr3);

        int n = arr3.length;

        double median; 
        if(n%2!=0){
            median = arr3[n/2];
        }
        else{
            median = (arr3[n/2 - 1] + arr3[n/2]) / 2.0;
        }
        return median;
        
    }
}