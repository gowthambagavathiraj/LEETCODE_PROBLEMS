class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        Arrays.sort(nums);
    int sum=0;
    for(int i=0;i<nums.length-1;i++){
        sum=sum+max-nums[i];
    }
    return sum;
    }
}