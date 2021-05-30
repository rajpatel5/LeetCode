import java.util.*;

class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        /* 
            Time: O(nm), n = points.length and m = queries.length
            Space: O(m), m = queries.length
        */
        
        int n = points.length;
        int m = queries.length;
        int[] answer = new int[m];
        int count = 0;
        
        for (int i = 0; i < m; i++) {
            count = 0;
            
            for (int j = 0; j < n; j++) {
                double xDiffSq = Math.pow((points[j][0] - queries[i][0]), 2);
                double yDiffSq = Math.pow((points[j][1] - queries[i][1]), 2);
                double dist = Math.sqrt(xDiffSq + yDiffSq);
                
                if (dist <= (double) queries[i][2]) {
                    count += 1;
                }
            }
            
            answer[i] = count;
        }
        
        return answer;
    }
}