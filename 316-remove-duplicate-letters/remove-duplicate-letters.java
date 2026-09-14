class Solution {
    public String removeDuplicateLetters(String s) {

        int[] freq = new int[26];
        boolean[] present = new boolean[26];
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        // Count frequency of every character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        // Process the string
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // This occurrence is being processed
            freq[ch - 'a']--;

            // If already present in stack, skip it
            if (present[ch - 'a']) {
                continue;
            }

            // Remove bigger characters if they appear again later
            while (!st.isEmpty()
                    && ch < st.peek()
                    && freq[st.peek() - 'a'] > 0) {

                present[st.peek() - 'a'] = false;
                st.pop();
            }

            // Add current character
            st.push(ch);
            present[ch - 'a'] = true;
        }

        // Build answer
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}