class Solution {
    int findNumber(int n) {
        int sum=0;
    while(n>0)
    {
        int digit=n%10;
        sum+=digit;
        n=n/10;
    }
    return sum;
    }
    public int addDigits(int num) {
        if(num<10)
        {
            return num;
        }
        int n=findNumber(num);
       return  addDigits(n);
    }
}