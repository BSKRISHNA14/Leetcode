class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            while(nums[i]!=0 && nums[j]==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            if(nums[j]!=0){
                j++;
            }
        }
        return;
    }
}