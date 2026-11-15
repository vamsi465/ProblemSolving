class Solution {
    public int mySqrt(int x) {
        if(x==1) {
            return 1;
        }
        int st=1;
        int end=x/2;
        int ans=0;
        while(st<=end) {
            int mid=st+(end-st)/2;
            if(mid<=x/mid) {
                ans=mid;
                st=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return ans;
    }
}