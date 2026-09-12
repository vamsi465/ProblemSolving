class Solution {
    int[] nsl(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                ans[i]=st.peek();
            }
            else {
                ans[i]=-1;
            }
            st.push(i);
        }
        return ans;
    }
    int[] nsr(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--) {
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                ans[i]=st.peek();
            }
            else {
                ans[i]=arr.length;
            }
            st.push(i);
        }
        return ans;
    }
    public int largestRectangleArea(int[] heights) {
        int[] nsl=nsl(heights);
        int[] nsr=nsr(heights);
        int max=0;
        for(int i=0;i<heights.length;i++) {
            int area=heights[i]*(nsr[i]-nsl[i]-1);
            max=Math.max(max,area);
        }
        return max;
    }
}