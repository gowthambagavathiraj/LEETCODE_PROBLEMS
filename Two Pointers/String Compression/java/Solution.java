class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        for (char ch : chars) {
            sb.append(ch);
        }
        String ans = sb.toString();
        StringBuilder ss = new StringBuilder();
        int count = 1;
        
        for (int i = 0; i < ans.length() - 1; i++) {
            if (ans.charAt(i) == ans.charAt(i + 1)) {
                count++;
            } else {
                ss.append(ans.charAt(i));
               
                if (count > 1) {
                    ss.append(count);
                }
                count = 1;
            }
        }
        
        ss.append(ans.charAt(ans.length() - 1));
        if (count > 1) ss.append(count);
        
        char[] aaa = ss.toString().toCharArray();
        for (int i = 0; i < aaa.length; i++) {
            chars[i] = aaa[i];
        }
        return aaa.length;
    }
}