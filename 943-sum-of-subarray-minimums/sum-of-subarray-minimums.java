class Solution {
    int[] findNSL(int[] arr)
    {
        int[] nsl=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty()&&arr[i]<=arr[st.peek()])
            {
                st.pop();
            }
            if(!st.isEmpty()) {
                nsl[i]=st.peek();
            }
            else {
                nsl[i]=-1;
            }
            st.push(i);
        }
        return nsl;
    }
    int[] findNSR(int[] arr)
    {
        int[] nsr=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!st.isEmpty()&&arr[i]<arr[st.peek()])
            {
                st.pop();
            }
            if(!st.isEmpty()) {
                nsr[i]=st.peek();
            }
            else {
                nsr[i]=arr.length;
            }
            st.push(i);
        }
        return nsr;
    }
    public int sumSubarrayMins(int[] arr) {
        int[] nsl=findNSL(arr);
        int[] nsr=findNSR(arr);
        long sum=0;
        long MOD = 1000000007;
        for(int i=0;i<arr.length;i++) {
            long left=i-nsl[i];
            long right=nsr[i]-i;
            sum=(sum+left*right*arr[i] % MOD) % MOD;
        }
        return (int)sum;
    }
}