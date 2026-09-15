class Solution {
    public int myAtoi(String s) {
        int i=0;
        int num=0;
        int sign=1;

        //1.Checking whitespaces instead of while loop we can use s=s.trim()
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }

        //2.Check sign
        if(i<s.length() && s.charAt(i)=='+'){
            i++;
        }
        else if(i<s.length() && s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else{
            sign=1;   // If there is no sign, sign remains +1
        }

        //3.Read Digits
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';

            //4.Check Workflow
            if(num>(Integer.MAX_VALUE-digit)/10){
                if(sign==1){
                    return Integer.MAX_VALUE;
                }
                else{
                    return Integer.MIN_VALUE;
                }
            }
            num=num*10+digit;
            i++;
        }
        //5.Return Integer
        return num*sign;
    }
}