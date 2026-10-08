class Solution {
    public int majorityElement(int[] nums) {
        int majority=nums[0];
        int cnt=1;
        for(int i=1;i<nums.length;i++) {
            if(majority==nums[i]) {
                cnt++;
            }
            else if(majority!=nums[i]) {
                cnt--;
            }
            if(cnt==0) {
                majority=nums[i];
                cnt++;
            }
        }
        return majority;
    }
}