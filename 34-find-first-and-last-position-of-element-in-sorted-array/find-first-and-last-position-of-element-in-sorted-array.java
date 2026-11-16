class Solution {
    public int[] searchRange(int[] nums, int target) {
        int st=0;
        int end=nums.length-1;
        int first_pos=-1;
        int second_pos=-1;
        int[] ans=new int[2];
        while(st<=end) {
            int mid=st+(end-st)/2;
            if(nums[mid]==target) {
                first_pos=mid;
                end=mid-1;
            }
            else if(nums[mid]<target) {
                st=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        st=0;
        end=nums.length-1;
        while(st<=end) {
            int mid=st+(end-st)/2;
            if(nums[mid]==target) {
                second_pos=mid;
                st=mid+1;
            }
            else if(nums[mid]<target) {
                st=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        ans[0]=first_pos;
        ans[1]=second_pos;
        return ans;

    }
}