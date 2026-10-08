class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        int count=0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                count++;

                if(count>1){
                    ans.append(ch);
                }
            }
            else{
                if(count>1){
                    ans.append(ch);
                }
                count--;
            }
        }
        return ans.toString();
    }
}