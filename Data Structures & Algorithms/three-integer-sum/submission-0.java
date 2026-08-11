public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            //check for negative, if loop breaks then return empty list
            if (nums[i] > 0) break;
            // checks next element in list and compares to previous to 
            //find duplicates. If duplicate skip this iteration and go to next
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            //setup two pointers
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                //sum
                int sum = nums[i] + nums[l] + nums[r];

                //if sum > 0, number too big so decrement r
                if (sum > 0) {
                    r--;
                } else if (sum < 0) { // sum too small
                    l++;
                } else { // sum = 0
                    //add to list as a list of triplets
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    //ensures pointers dont get stuck
                    l++;
                    r--;

                    //skips any past repeats
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }
        return res;
    }
}
