class Solution {
    public int[] getConcatenation(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
         for(int num1:nums){
            list.add(num1);
        }
        int newarr[]=new int[list.size()];
        for(int i=0;i<newarr.length;i++){
            newarr[i]=list.get(i);
        }
        return newarr ;
    }
}