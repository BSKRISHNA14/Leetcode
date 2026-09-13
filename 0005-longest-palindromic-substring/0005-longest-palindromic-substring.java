class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
            int odd=expand(s,i,i);             //finds odd palindrome length
            int even=expand(s,i,i+1);          //finds even palindrome length

            int len=Math.max(odd,even);        //takes the longer length

            if(ans.length()<len){
                int start=i-(len-1)/2;           // finds where the palindrome starts
                int end=i+len/2;                 // finds where the palindrome ends
                ans=s.substring(start,end+1);    // +1 because substring excludes the ending index
            }
        }
        return ans;
    }
    private int expand(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;        // both pointers moved outside, so calculate length
    }
}