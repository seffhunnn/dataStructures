class Solution {
    public static boolean isPalindrome(String s){
        int left = 0; int right= s.length()-1;

        while(left<right){
            if(s.charAt(left)!= s.charAt(right))
            return false;
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {

        String longest = "";
        for(int i =0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub = s.substring(i,j+1);

                if(isPalindrome(sub) && sub.length()>longest.length()){
                    longest = sub;
                }
            }
        }

        return longest;
        
    }
}