class Solution {
    public long findTheArrayConcVal(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        long sum = 0;

        while (left <= right) {

            if (left == right) {
                sum += nums[left];
            } else {
                String s = nums[left] + "" + nums[right];
                sum += Long.parseLong(s);
            }

            left++;
            right--;
        }

        return sum;
    }
}