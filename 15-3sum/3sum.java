class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++) {
            int st=i+1;
            int end=nums.length-1;
            if(i>0&&nums[i-1]==nums[i]) {
                continue;
            }
            while(st<end) {
                List<Integer> al=new ArrayList<>();
                int res=nums[st]+nums[end];
                if(res+nums[i]==0) {
                    //add this elements into my list
                    al.add(nums[i]);
                    al.add(nums[st]);
                    al.add(nums[end]);
                    ans.add(al);
                    st++;
                    end--;
                    while(st<end&&nums[st]==nums[st-1]) {
                        st++;
                    }
                    while(st<end&&nums[end]==nums[end+1]) {
                        end--;
                    }
                }
                else if(res+nums[i]>0) {
                    end--;
                }
                else {
                    st++;
                }
            }
           
        }
         return ans;   
    }
    }
