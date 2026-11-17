class Solution {
    int maxPile(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }
    boolean canEat(int arr[],int k,int h) {
        long cnt=0;
        for(int i=0;i<arr.length;i++) {
            cnt+=(arr[i]+k-1L)/k;
        }
        return cnt<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int st=1;
        int end=maxPile(piles);
        int ans=0;
        while(st<=end) {
            int mid=st+(end-st)/2;
            if(canEat(piles,mid,h))
            {
                 ans=mid;
                end=mid-1;
            }
            else {
                st=mid+1;
            }
        }
        return ans;
    }
}