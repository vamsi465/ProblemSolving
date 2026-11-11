class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_len=0;
        for(int i=0;i<=s.length()-1;i++) {
            boolean[] visited=new boolean[256];
            for(int j=i;j<=s.length()-1;j++) {
                char ch=s.charAt(j);
                if(visited[ch]) {
                    break;
                }
                visited[ch]=true;
                max_len=Math.max(max_len,j-i+1);
            }
        }
        return max_len;
    }
}