class Solution {
    public void sortColors(int[] nums) {
      int cnt1=0;
      int cnt2=0;
      int cnt3=0;
      for(int i=0;i<nums.length;i++) {
        if(nums[i]==0)
        {
            cnt1++;
        }
        else if(nums[i]==1) {
            cnt2++;
        }
        else if(nums[i]==2) {
            cnt3++;
        }
      }
      for(int i=0;i<cnt1;i++) {
        nums[i]=0;
      }
       for(int i=cnt1;i<cnt1+cnt2;i++) {
        nums[i]=1;
      }
       for(int i=cnt2+cnt1;i<cnt3+cnt1+cnt2;i++) {
        nums[i]=2;
      }
    }
}