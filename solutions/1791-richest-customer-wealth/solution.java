class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSum = Integer.MIN_VALUE;
        for (int[] customer : accounts) {
            int sum = 0;
            for (int bank : customer) {
                sum += bank;
            }
            if (sum > maxSum) maxSum = sum;
        }
        return maxSum;
    }
}
