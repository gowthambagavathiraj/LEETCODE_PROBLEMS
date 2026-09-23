class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
    for(int i=1;i<s.length();i++){
        int ans=Math.abs(s.charAt(i-1)-s.charAt(i));
        System.out.println(ans);
    
        if(ans>2){
            return false;
        }
    }
    return true;
    }
}