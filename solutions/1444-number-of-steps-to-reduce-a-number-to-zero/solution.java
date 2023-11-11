class Solution {
    public int numberOfSteps(int num) {
        int stepCnt = 0;
        while (num != 0) {
            stepCnt++;
            boolean isEven = (num & 0b1) == 0;
            if (isEven) num >>= 1;
            else num--;
        }
        return stepCnt;
    }
}
