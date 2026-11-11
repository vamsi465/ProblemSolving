class Solution {
    public int[] searchRange(int[] nums, int target) {
        int st=0;
        int end=nums.length-1;
        int pos1=-1;
        int pos2=-1;
        int[] ans=new int[]{pos1,pos2};
        if(nums.length<1) {
            return ans;
        }
        while(st<=end) {
            int mid=st+(end-st)/2;
            if(target==nums[mid]) {
                 pos1=mid;
                end=mid-1;
            }
            else if(target>nums[mid]) {
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
            if(target==nums[mid]) {
                 pos2=mid;
                 st=mid+1;
            }
            else if(target>nums[mid]) {
                st=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        ans[0]=pos1;
        ans[1]=pos2;
        return ans;
    }
}