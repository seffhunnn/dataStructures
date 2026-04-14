class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for(int i=0;i<=n;i++){
            int currentHeight;

            if(i==n) currentHeight = 0;
            else currentHeight = heights[i];

            while(!st.isEmpty() && currentHeight< heights[st.peek()]){
                int height = heights[st.pop()];
                int width;
                if(st.isEmpty()) width=i;
                else width = i-st.peek()-1;
                maxArea = Math.max(maxArea,height*width);
            }
            st.push(i);
        }
        return maxArea;
    }
}