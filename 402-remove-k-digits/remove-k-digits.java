class Solution {
    public String removeKdigits(String num, int k) {
      Stack<Character>st=new Stack<>();
      StringBuilder ans=new StringBuilder();
      for(int i=0;i<num.length();i++) {
        char n=num.charAt(i);
        while(!st.isEmpty()&&n<st.peek()&&k>0) {
            st.pop();
            k--;
        } 
        st.push(n);
      }
      while(k>0)
      {
        st.pop();
        k--;
      } 
      while(!st.isEmpty()) {
        ans=ans.append(st.pop());
      }
      ans.reverse();
      while(ans.length()>1&&ans.charAt(0)=='0') {
            ans.deleteCharAt(0);
      }
      if(ans.length()==0) {
        return "0";
      }
      return ans.toString();
    }
}