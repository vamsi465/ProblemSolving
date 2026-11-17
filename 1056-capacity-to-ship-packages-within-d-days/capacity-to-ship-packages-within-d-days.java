class Solution {
    boolean canShift(int[] arr,int mid,int days) {
        int capacity=0;
        int cnt=1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>mid) {
                return false;
            }
            if(capacity+arr[i]<=mid) {
                 capacity+=arr[i];
            }
            else {
               cnt++;
                capacity=arr[i];
            }
        }
        return cnt<=days;
    }
    int total(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public int shipWithinDays(int[] weights, int days) {
       int st=1;
       int end=total(weights);
       int ans=0;
       while(st<=end) {
        int mid=st+(end-st)/2;
        if(canShift(weights,mid,days)) {
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