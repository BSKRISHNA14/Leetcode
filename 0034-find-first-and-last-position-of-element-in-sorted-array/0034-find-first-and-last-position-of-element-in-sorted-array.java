class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;

        //First Occurence
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                first=mid;
                right=mid-1; //search for the elements before mid to check the target value
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }

         //Last Occurence
         left=0;
         right=nums.length-1;
         while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                last=mid;
                left=mid+1;  //search for the elements after mid to check the target value
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            } 
        }
        return new int[]{first,last};
    }
}