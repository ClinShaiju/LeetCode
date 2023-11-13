class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = Integer.MIN_VALUE;
        int cnt = 0;
        for (int num : nums) {
            if (num == 1) cnt++;
            else {
                if (cnt > maxConsecutiveOnes) maxConsecutiveOnes = cnt;
                cnt = 0;
            }
        }
        if (cnt > maxConsecutiveOnes) maxConsecutiveOnes = cnt;
        return maxConsecutiveOnes;
    }
}
