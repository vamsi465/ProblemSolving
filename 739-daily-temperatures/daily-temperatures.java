class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int ans[]=new int[temperatures.length];
        int k=temperatures.length-1;
        Stack<Integer> st=new Stack<>();
        for(int i=temperatures.length-1;i>=0;i--)
        {
            while(!st.isEmpty()&&temperatures[i]>=temperatures[st.peek()])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                ans[k--]=st.peek()-i;
            }
            else
            {
                ans[k--]=0;
            }
            st.push(i);
        }
        return ans;
    }
}