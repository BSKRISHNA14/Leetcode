class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb1=new StringBuilder();
        int i=0;
        int j=0;
        while(i<word1.length() || j<word2.length()){
            if(i<word1.length()){
                sb1.append(word1.charAt(i));
                i++;
            }
             if(j<word2.length()){
                sb1.append(word2.charAt(j));
                j++;
            }
        }
        return sb1.toString();
    }
}