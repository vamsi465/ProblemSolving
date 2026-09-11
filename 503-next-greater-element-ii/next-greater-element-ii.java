class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[nums.length];
        int n=nums.length;
        int k=nums.length-1;
        for(int i=(2*n-1);i>=0;i--) {
            int index=i%n;
            while(!st.isEmpty()&&nums[index]>=st.peek())
            {
                st.pop();
            }
            if(i<n)
            {
                if(st.isEmpty()) {
                    ans[k--]=-1;
                }
                else {
                    ans[k--]=st.peek();
                }
            }
            st.push(nums[index]);
        }
        return ans;
    }
}