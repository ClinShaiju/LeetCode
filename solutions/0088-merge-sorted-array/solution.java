class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int firstArr = m -1;
        int secondArr = n-1;
        int bothArr = m+n-1;
        while (secondArr>=0) {
            if (firstArr >=0 && nums1[firstArr] > nums2[secondArr]) {
                nums1[bothArr--] = nums1[firstArr--];
            } else {
                nums1[bothArr--] = nums2[secondArr--];
            }
        }
    }
}
