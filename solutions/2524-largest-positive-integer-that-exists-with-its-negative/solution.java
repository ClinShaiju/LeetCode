class Solution {
    public int findMaxK(int[] nums) {
        int negPointer = 0;
        int posPointer = nums.length - 1;
        Arrays.sort(nums);
        while (negPointer < nums.length && posPointer >= 0) {
            if (nums[posPointer] == -nums[negPointer]) return nums[posPointer];
            if (nums[posPointer]<-nums[negPointer]) negPointer++;
            else posPointer--;       
        }
        
        return -1;
    }
}
