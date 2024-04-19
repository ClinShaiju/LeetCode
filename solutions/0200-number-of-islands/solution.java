class Solution {
    public int numIslands(char[][] grid) {
        int islandCount = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c]=='1') {
                    deleteIsland(grid, r, c);
                    islandCount++;
                }
            }
        }
        return islandCount;
    }

    public void deleteIsland(char[][] grid, int r, int c) {
        grid[r][c] = '0';
        if (inBounds(grid, r-1, c) && grid[r-1][c] == '1') deleteIsland(grid, r-1, c);
        if (inBounds(grid, r+1, c) && grid[r+1][c] == '1') deleteIsland(grid, r+1, c);
        if (inBounds(grid, r, c-1) && grid[r][c-1] == '1') deleteIsland(grid, r, c-1);
        if (inBounds(grid, r, c+1) && grid[r][c+1] == '1') deleteIsland(grid, r, c+1);

    }

    public boolean inBounds(char[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r>=grid.length || c>=grid[0].length) return false;
        return true;
    }
}
