class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        /*
            Time: O(n^2), n = grid.length (Square matrix)
            Space: O(n), n = grid.length (Square matrix)
        */
        
        int n = grid.length;
        
        // Initialize
        int[] top = new int[n];
        int[] left = new int[n];
        for (int i = 0; i < n; i++) {
            top[i] = 0;
            left[i] = 0;
        }
        
        // Find height of skyline from top/bottom and left/right view
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > left[i]) {
                    left[i] = grid[i][j];
                }
                if (grid[j][i] > top[i]) {
                    top[i] = grid[j][i];
                }
            }
        }
        
        // Find final height
        int totalHeight = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int maxHeight = Math.min(left[i], top[j]);
                totalHeight += maxHeight - grid[i][j];
            }
        }
        
        return totalHeight;
    }
}