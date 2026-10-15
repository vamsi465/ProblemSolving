class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n-3;i++) {
            if(i>0&&nums[i-1]==nums[i]) {
                continue;
            }
            for(int j=i+1;j<n-2;j++) {
                if(j>i+1&&nums[j-1]==nums[j]) {
                continue;
            }
                int st=j+1;
                int end=n-1;
                while(st<end) {
                    List<Integer> ls=new ArrayList<>();
                    long ans=(long)nums[i]+nums[j]+nums[st]+nums[end];
                    if(ans==target) {
                        ls.add(nums[i]);
                        ls.add(nums[j]);
                        ls.add(nums[st]);
                        ls.add(nums[end]); 
                        result.add(ls);
                        st++;
                        end--;
                        while(st<end&&nums[st-1]==nums[st]) {
                            st++;
                        } 
                        while(st<end&&nums[end+1]==nums[end]) {
                            end--;
                        } 
                               }
                    else if(ans>target) {
                        end--;
                    }
                    else {
                        st++;
                    }
                }
            }
        }
        return result;
    }
}