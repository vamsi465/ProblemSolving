class Solution {
    int leastElement(int[] arr) {
        int mini=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++) {
            if(arr[i]<mini)
            {
                mini=arr[i];
            }
        }
        return mini;
    }
    boolean canFind(int[] arr,int k,long min) {
        long sum=0;
        for(int i=0;i<arr.length;i++) {
            sum+=min/arr[i];
        }
        if(sum>=k)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public long minimumTime(int[] time, int totalTrips) {
        long st=leastElement(time);
        long end=st*totalTrips;
        long ans=end;
        while(st<=end) {
            long mid=st+(end-st)/2;
            if(canFind(time,totalTrips,mid)) {
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