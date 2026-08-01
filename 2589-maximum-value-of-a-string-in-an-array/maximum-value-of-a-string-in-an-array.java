class Solution {
    public int maximumValue(String[] strs) {
        int max = Integer.MIN_VALUE;
        
        for (String s : strs) {
            int value;
        
            if (s.matches("\\d+")) {
                value = Integer.parseInt(s);
            } else {
                value = s.length(); 
            }
            max = Math.max(max, value);
        }
        
        return max;
    }
}
