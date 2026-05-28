class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int j = nums.length - 1;
        int i = 0;
        int[] temp = new int[nums.length];
        for(int n = 0; n <= nums.length - 1; n++) {
            if(nums[n] % 2 == 0) {
                temp[i] = nums[n];
                i++;
            }
            else {
                temp[j] = nums[n];
                j--;
            }
        }
        return temp;
    }
}