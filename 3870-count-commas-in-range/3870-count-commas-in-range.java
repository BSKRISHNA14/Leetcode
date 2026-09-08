class Solution {
    public int countCommas(int n) {
        if (n < 1000) {
            return 0;
        } 
        else if (n < 1000000) {
            return n - 999;
        } 
        else if (n < 1000000000) {
            return (n - 999) + (n - 999999);
        } 
        else {
            return (n - 999) + (n - 999999) + (n - 999999999);
        }
    }
}