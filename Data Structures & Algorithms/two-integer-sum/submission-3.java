class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sums = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    sums[0] = i;
                    sums[1] = j;
                }
            }
        }
        Arrays.sort(sums);
        return sums;
    }
}
