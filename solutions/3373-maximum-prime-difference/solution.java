class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int leftMax = Integer.MIN_VALUE;
        int rightMin = Integer.MAX_VALUE;
        boolean primeFound = false;
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                if (i>leftMax) leftMax = i;
                if (i < rightMin) rightMin = i;
                primeFound = true;
            }
        }
        if (primeFound) return leftMax - rightMin;
        return 0;
        
    }
    
    public boolean isPrime(int num) {
        if (num == 1) return false;
        if (num==2) return true;
        for (int i = 2; i < num/2+1; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
