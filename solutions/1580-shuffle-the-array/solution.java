class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newArr = new int[n*2];
        for (int i = 0; i < nums.length/2; i++) {
            newArr[2*i] = nums[i];
            newArr[2*i+1] = nums[n+i];
        }
        return newArr;
    }
}
