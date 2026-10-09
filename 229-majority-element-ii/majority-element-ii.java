class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> al=new ArrayList<>();
        int cnt1=0;
        int cnt2=0;
        int majority_element1=0;
        int majority_element2=0;
        for(int i=0;i<nums.length;i++) {
            if( cnt1>0&&majority_element1==nums[i]) {
                cnt1++;
            }
            else if(cnt2>0&&majority_element2==nums[i]){
               cnt2++;
            }
            else if(cnt1==0) {
                majority_element1=nums[i];
                cnt1++;
             }
             else if(cnt2==0) {
                majority_element2=nums[i];
                cnt2++;
             }
             else {
                cnt1--;
                cnt2--;
             }
             
             }
             cnt1=0;
             cnt2=0;
             for(int i=0;i<nums.length;i++) {
                if(majority_element1==nums[i]) {
                    cnt1++;
                }
                else if(majority_element2==nums[i]) {
                    cnt2++;
                }
             }
             if(cnt1>nums.length/3) {
                al.add(majority_element1);
             }
             if(cnt2>nums.length/3) {
                al.add(majority_element2);
             }
             return al;
        }
}