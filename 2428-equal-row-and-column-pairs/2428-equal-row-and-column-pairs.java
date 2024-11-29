import java.util.HashMap;

class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> rowMap = new HashMap<>();
        
        // Convert each row to a string and count frequencies
        for (int[] row : grid) {
            String rowStr = arrayToString(row);
            rowMap.put(rowStr, rowMap.getOrDefault(rowStr, 0) + 1);
        }
        
        int count = 0;
        // Compare columns with rows
        for (int i = 0; i < grid.length; i++) {
            int[] column = new int[grid.length];
            for (int j = 0; j < grid.length; j++) {
                column[j] = grid[j][i];
            }
            String columnStr = arrayToString(column);
            count += rowMap.getOrDefault(columnStr, 0);
        }
        
        return count;
    }
    
    private String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num).append(",");
        }
        return sb.toString();
    }
}
