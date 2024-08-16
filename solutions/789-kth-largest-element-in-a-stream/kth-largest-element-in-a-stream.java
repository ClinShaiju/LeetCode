class KthLargest {
    private final int k;
    private final int[] nums;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = new int[k];

        Arrays.sort(nums);
        Arrays.fill(this.nums, Integer.MIN_VALUE);
        for (int i = 0; i < k && i < nums.length; i++) this.nums[this.nums.length - 1 - i] = nums[nums.length - 1 - i];
    }

    public int add(int val) {
        if (val > nums[0]) nums[0] = val;
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */