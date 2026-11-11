class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_len=0;
        int j=0;
        boolean[] visited=new boolean[256];
        for(int i=0;i<=s.length()-1;i++) {
            char ch=s.charAt(i);
              while(visited[ch]) {
                visited[s.charAt(j)]=false;
                j++;
              }
              visited[ch]=true;
              max_len=Math.max(max_len,i-j+1);
            }
        return max_len;
    }
}