class Solution {
    public int secondHighest(String s) {
     TreeSet<Character> set=new TreeSet<>();
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(Character.isDigit(ch)){
            set.add(ch);
            System.out.println(set);
        }
     }
        if(set.size()<2){
            return -1;
        
     }  
     set.pollLast();
     return set.pollLast()-'0';
    }
}