class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        
        int count=0;
        int count2=0;
        for(int i=0;i<s.length()/2;i++){
            char ch=s.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            count++;
           }
        }
        for(int i=s.length()/2;i<s.length();i++){
            char ch1=s.charAt(i);
            if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'){
            count2++;
           }
        }
        return count==count2;
    }
}