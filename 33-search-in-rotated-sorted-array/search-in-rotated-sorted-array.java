class Solution {
    public int search(int[] nums, int target) {
        int st=0;
        int end=nums.length-1;
        while(st<=end) {
            int mid=st+(end-st)/2;
            if(nums[mid]==target) {
                return mid;
            }
                if(nums[st]<=nums[mid]) {
                if(target>=nums[st]&&target<nums[mid]) {
                    end=mid;
                }
                else {
                    st=mid+1;
                }
            }
            else {
                if(target>nums[mid]&&target<=nums[end]) {
                    st=mid+1;
                }
                else {
                    end=mid;
                }
            }
        }
        return -1;
    }
}