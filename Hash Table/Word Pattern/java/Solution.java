class Solution {
    public boolean wordPattern(String pattern, String str) {
        
         String words[] = str.split(" ");

        HashMap<Character, String> map = new HashMap<>();

        boolean result = true;

        if(pattern.length() != words.length) {
            result = false;
        }
        else {
            for(int i = 0; i < pattern.length(); i++) {

                char ch = pattern.charAt(i);

                if(map.containsKey(ch)) {

                    if(!map.get(ch).equals(words[i])) {
                        result = false;
                        break;
                    }

                } else {

                    // Check duplicate values
                    if(map.containsValue(words[i])) {
                        result = false;
                        break;
                    }

                    map.put(ch, words[i]);
                }
            }
        }

        return result;
    }
}