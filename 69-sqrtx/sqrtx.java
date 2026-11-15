class Solution {
    public int mySqrt(int x) {
        int i=1;
        int ans=0;
        while(i<=(x/i)) {
            ans=i;
            i++;
        }
        return ans;
    }
}