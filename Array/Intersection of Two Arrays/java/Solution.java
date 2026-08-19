class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     HashSet<Integer> one=new HashSet<>();
     HashSet<Integer> two=new HashSet<>();
     for(int i=0;i<nums1.length;i++){
        one.add(nums1[i]);

     }  
     for(int i=0;i<nums2.length;i++){
        if(one.contains(nums2[i])){
        two.add(nums2[i]);
     } 
     }
     int j=0;
     int []arr=new int[two.size()];
     for(int res:two){
    arr[j++]=res;
    }
     
    return arr;
}
}