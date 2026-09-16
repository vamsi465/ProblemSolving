class Solution {
    public int longestValidParentheses(String s) {
        int left=0;
        int right=0;
        int max=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='(') {
                left++;
            }
            else {
                right++;
                if(left==right) {
                    max=Math.max(2*left,max);
                }
                else if(left>right)
                {
    
                }
                else {
                    left=0;
                    right=0;
                }
            }
        }
        left=0;
        right=0;
        for(int i=s.length()-1;i>=0;i--) {
            if(s.charAt(i)==')') {
                right++;
            }
            else {
                left++;
                if(left==right) {
                    max=Math.max(2*right,max);
                }
                else if(right>left) {
                }
                else {
                    left=0;
                    right=0;
                }
            }
        }
        return max;

    }
}