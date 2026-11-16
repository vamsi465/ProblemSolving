class Solution {
    void reverseArray(int[] arr,int st,int end) {
            while(st<end) {
                 int temp=arr[st];
                 arr[st]=arr[end];
                 arr[end]=temp;
                st++;
                end--;
            }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverseArray(nums,0,nums.length-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,nums.length-1);
    }
}