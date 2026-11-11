class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int st=0;
        int end=m*n- 1;
        while(st<=end) {
            int mid=st+(end-st)/2;
            int row=mid/m;
            int col=mid%m;
            if(matrix[row][col]==target) {
                return true;
            }
            else if(matrix[row][col]<target) {
                st=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return false;
    }
}