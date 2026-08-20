class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing=true;
        boolean decreasing=true;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                decreasing=false;
            }
            else if(nums[i]<nums[i-1]){
                increasing=false;
            }
        }
        return increasing || decreasing;
    }
}