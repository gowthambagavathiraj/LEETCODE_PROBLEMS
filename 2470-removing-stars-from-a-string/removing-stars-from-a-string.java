import java.util.*;

class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != '*') {
                st.push(ch);
            } else {
                st.pop();
            }
        }

        for (char c : st) {
            sb.append(c);
        }

        return sb.toString();
    }
}