class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;

        int[] row=new int[r];
        int[] col=new int[c];

        // Step 1: Find the original zeros
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        // Step 2: Make the required rows and columns zero
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}