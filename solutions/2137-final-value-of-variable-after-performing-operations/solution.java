class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int operand = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(1) == '-') operand--;
            else operand++;

        } 
        return operand;
    }
}
