class Solution {
    public int maxProduct(int[] nums) {
        int minproduct=nums[0];
        int maxproduct=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int num=nums[i];
            if(num<0){
                int temp=maxproduct;
                maxproduct=minproduct;
                minproduct=temp;
            }
            maxproduct=Math.max(num,maxproduct*num);
            minproduct=Math.min(num,minproduct*num);
            ans=Math.max(ans,maxproduct);
        }
        return ans;
    }
}