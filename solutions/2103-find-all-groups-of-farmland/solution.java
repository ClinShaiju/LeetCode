class Solution {
    public int[][] findFarmland(int[][] land) {
        ArrayList<int[]> farmlandCoords = new ArrayList<>();
        for (int r = 0; r < land.length; r++) {
            for (int c = 0; c < land[r].length; c++) {
                if (land[r][c]==1) {
                    farmlandCoords.add(getBounds(land, r, c));
                    deleteFarmland(land, r, c);
                }
            }
        }
        int[][] farmlands = new int[farmlandCoords.size()][4];
        for (int i = 0; i < farmlands.length; i++) {
            farmlands[i] = farmlandCoords.get(i);
        } 
        return farmlands;
    }

    public int[] getBounds(int[][] land, int r, int c) {
        int rB = c;
        int bB = r;

        for (; inBounds(land, r, rB) && land[r][rB] != 0; rB++);
        for (; inBounds(land, bB, c) && land[bB][c] != 0; bB++);
        
        return new int[] {r, c, --bB, --rB};


    }
    
    public void deleteFarmland(int[][] land, int r, int c) {
        land[r][c] = 0;
        if (inBounds(land, r-1, c) && land[r-1][c] == 1) deleteFarmland(land, r-1, c);
        if (inBounds(land, r+1, c) && land[r+1][c] == 1) deleteFarmland(land, r+1, c);
        if (inBounds(land, r, c-1) && land[r][c-1] == 1) deleteFarmland(land, r, c-1);
        if (inBounds(land, r, c+1) && land[r][c+1] == 1) deleteFarmland(land, r, c+1);

    }

    public boolean inBounds(int[][] land, int r, int c) {
        if (r < 0 || c < 0 || r>=land.length || c>=land[0].length) return false;
        return true;
    }
}
