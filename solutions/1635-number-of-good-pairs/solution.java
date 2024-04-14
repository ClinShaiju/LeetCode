class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] hash = new int[100];
        int numPairs = 0;
        for (int i = 0; i < nums.length; i++) hash[nums[i]-1]++;
        for (int i = 0; i < hash.length; i++) numPairs += hash[i] * (hash[i] - 1) / 2;
        return numPairs;
    }
}
