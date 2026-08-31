class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;

//first element and n==1 because if array is of length 1 then we need to return 0 index only
        if(n==1 || nums[0]>nums[1]){
            return 0;
        }

        //middle element
        for(int i=1;i<n-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                return i;
            }
        }

        //last element
        if(nums[n-1]>nums[n-2]){
            return n-1;
        }
        return -1;
    }
}