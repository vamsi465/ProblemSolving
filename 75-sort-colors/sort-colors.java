class Solution {
    void swap(int[] nums,int a,int b) {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void sortColors(int[] nums) {
        int st=0;
        int mid=0;
        int end=nums.length-1;
        while(mid<=end) {
            if(nums[mid]==2) {
                swap(nums,end,mid);
                end--;
            }
            else if(nums[mid]==0) {
                swap(nums,st,mid);
                st++;
                mid++;
            }
            else if(nums[mid]==1) {
                mid++;
            }
        }
    }
}