class Solution {
    boolean canArrive(int arr[],int mid,double h) {
        double timeTaken=0;
        for(int i=0;i<arr.length;i++) {
            timeTaken=Math.ceil(timeTaken);
            timeTaken+=(double)arr[i]/mid;
        }
        return timeTaken<=h;

    }
    public int minSpeedOnTime(int[] dist, double hour) {
        int st=1;
        int end=10000000;
        int ans=-1;
        while(st<=end) {
            int mid=st+(end-st)/2;
            if(canArrive(dist,mid,hour)) {
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