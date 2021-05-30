import java.util.*;

class SubrectangleQueries {
    int[][] queryRectangle;
    int[][] updates = new int[500][5];
    int updateCount = 0;
        
    public SubrectangleQueries(int[][] rectangle) {
        /* 
            Time: O(1)
            Space: O(nm), n = rectangle.length and m = rectangle[i].length
        */
        
        queryRectangle = rectangle;
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) { 
        /*
            Time: O(1)
            Space: O(1)
        */
        updateCount++;
        updates[updateCount] = new int[]{row1, col1, row2, col2, newValue};
    }
    
    public int getValue(int row, int col) {
        /*
            Time: O(1), since updateCount <= 500
            Space: O(1)
        */
        
        for (int i = updateCount; i > 0; i--) {
            if ((row >= updates[i][0] && row <= updates[i][2]) && 
               (col >= updates[i][1] && col <= updates[i][3])) {
                return updates[i][4];
            }
        }
        
        return queryRectangle[row][col];
    }
}