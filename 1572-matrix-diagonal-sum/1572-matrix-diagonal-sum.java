class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;

        for(int i=0;i<n;i++){
            //Sum of primary diagonal 
            sum=sum+mat[i][i];

            //Sum of secondary diagonal
            sum=sum+mat[i][n-i-1];
        }

        //Subtract the middle element if n is odd
        if(n%2==1){
            sum=sum-mat[n/2][n/2];
        }
        return sum;
    }
}