class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        //trying prefix postfix with storing in arrays

    
        //edge cases
        output[0] = 1;
        int postfix = 1;

        for (int i = 1; i < nums.length; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= postfix;
            postfix *= nums[i];
        }
        return output;

    }
}  
