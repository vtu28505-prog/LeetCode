class Solution {
    public int longestSubarray(int[] nums, int limit) {

        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {

            int min = nums[i];
            int max = nums[i];

            for (int j = i; j < nums.length; j++) {

                if (nums[j] < min) {
                    min = nums[j];
                }

                if (nums[j] > max) {
                    max = nums[j];
                }

                if (max - min <= limit) {
                    int length = j - i + 1;

                    if (length > maxLength) {
                        maxLength = length;
                    }
                } else {
                    break;
                }
            }
        }

        return maxLength;
    }
}