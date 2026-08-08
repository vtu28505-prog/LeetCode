class Solution {
    public void sortColors(int[] nums) {
         int[] sc = new int[3];
         for (int i = 0; i < nums.length; i++) {
            sc[nums[i]]++;
         }
         int index = 0;
         for (int i = 0; i < sc[0]; i++) {
            nums[index++] = 0;
         }
         for (int i = 0; i < sc[1]; i++) {
            nums[index++] = 1;
         }
         for ( int i = 0; i < sc[2]; i++) {
            nums[index++] = 2;
         }
    }
}