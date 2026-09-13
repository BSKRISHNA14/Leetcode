class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            int len1=expand(s,i,i);
            int len2=expand(s,i,i+1);
            
            int len=Math.max(len1,len2);

            if(len>ans.length()){
                int start=i-(len-1)/2;
                int end=i+(len/2);
                ans=s.substring(start,end+1);
            }
        }
        return ans;
    }
    public int expand(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}