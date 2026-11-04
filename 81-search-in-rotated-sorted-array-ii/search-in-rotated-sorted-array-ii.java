class Solution {
    public boolean search(int[] nums, int target) {
        int st=0;
        int end=nums.length-1;
        while(st<=end) {
            int mid=st+(end-st)/2;
            if(nums[mid]==target) {
                return true;
            }
            if(nums[mid]==nums[st]&& nums[mid]==nums[end]) {
                st++;
                end--;
            }
            else if(nums[st]<=nums[mid]) {
               if(target>=nums[st]&&target<nums[mid]) {
                 end=mid;
               }
               else {
                 st=mid+1;
               }
            }
            else {
                if(target<=nums[end]&&target>nums[mid])
                {
                    st=mid+1;
                }
                else
                {
                    end=mid;
                }      
            }
        }
        return false;
    }
}