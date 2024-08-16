class Solution {
    public boolean lemonadeChange(int[] bills) {
        int num5 = 0;
        int num10 = 0;
        for (int bill : bills) {
            if (bill == 5) num5++;
            if (bill == 10) num10++;

            int change = bill - 5;
            if (change == 0) continue;

            while (change > 0) {
                if (change >= 10 && num10 > 0) {
                    change -= 10;
                    num10--;
                } else if (change >= 5 && num5 > 0) {
                    change -= 5;
                    num5--;
                } else break;
            }
            if (change != 0) return false;
        }
        return true;
    }
}
