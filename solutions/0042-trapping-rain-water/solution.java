class Solution {
            public static int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int size = height.length;
        for (int i = 0; i < size - 1; i++) {
            left[i + 1] = Math.max(left[i], height[i]);
            right[size - 2 - i] = Math.max(right[size - 1 - i], height[size - 1 - i]);
        }
        int waterCount = 0;
        for (int i = 0; i < size; i++) waterCount += Math.max(Math.min(left[i], right[i]) - height[i], 0);
        System.gc();
        return waterCount;
    }
}
