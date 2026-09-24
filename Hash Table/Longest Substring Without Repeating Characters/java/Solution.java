import java.util.HashSet;

class Solution {

    public int lengthOfLongestSubstring(String str) {

        String longest = "";

        for(int i = 0; i < str.length(); i++) {

            HashSet<Character> set = new HashSet<>();

            String current = "";

            for(int j = i; j < str.length(); j++) {


                if(set.contains(str.charAt(j))) {

                    break;

                }


                set.add(str.charAt(j));

                current += str.charAt(j);


                if(current.length() > longest.length()) {

                    longest = current;

                }

            }
        }

        return longest.length();
    }
}