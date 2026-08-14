class Solution {
    public int findMin(int[] nums) {
        int minValue=Integer.MAX_VALUE;
        int n=nums.length;

        for(int i=0;i<n;i++){
            minValue=Math.min(minValue,nums[i]);
        }
        return minValue;
    }
}