import java.util.ArrayList;


public class P694 {
	class Solution {
	    ArrayList<Integer> size;
	    ArrayList<int[][]> island;
	    boolean[][] visited;
	    int[][] current;
	    int curSize = 0;
	    
	    public int numDistinctIslands(int[][] grid) {
	        if (grid.length == 0)
	            return 0;
	        int a = grid.length;
	        int b = grid[0].length;
	        
	        visited = new boolean[a][b];
	        current = new int[a][b];
	        size = new ArrayList<Integer>();
	        island = new ArrayList<int[][]>();
	        
	        for (int i = 0; i < a; i++) {
	            for (int j = 0; j < b; j++) {
	                explore(grid, i, j, a, b);
	                if (curSize > 0) {
	                    checkUnique(a, b);
	                    curSize = 0;
	                    current = new int[a][b];
	                }
	            }
	        }
	        return size.size();
	    }
	    
	    public void checkUnique(int a, int b) {
	        boolean unique = true;
	        for (int i = 0; i < size.size(); i++) {
	            if (curSize == size.get(i)) {
	                unique = unique && helper(i, a, b);
	            }
	        }
	        if (unique) {
	            size.add(curSize);
	            island.add(current);
	        }
	    }
	    
	    public boolean helper(int index, int a, int b) {
	        int x1 = 0;
	        int x2 = 0;
	        int y1 = 0;
	        int y2 = 0;
	        //Find the top left of the current island
	        for ( int i = 0; i < a; i++) {
	            for (int j = 0; j < b; j++) {
	                if( current[i][j] == 1) {
	                    x1 = i;
	                    y1 = j;
	                    break;
	                }
	            }
	        }
	        //Find the top left of the saved island
	        for ( int i = 0; i < a; i++) {
	            for (int j = 0; j < b; j++) {
	                if( island.get(index)[i][j] == 1) {
	                    x2 = i;
	                    y2 = j;
	                    break;
	                }
	            }
	        }
	        int gapX = x1 - x2;
	        int gapY = y1 - y2;
	        
	        for ( int i = 0; i < a; i++) {
	            for (int j = 0; j < b; j++) {
	                if( current[i][j] == 1) {
	                    if (i + gapX >= a || j + gapY >= b)
	                        return true;
	                    if (island.get(index)[i + gapX][j + gapY] != 1)
	                        return true;
	                }
	            }
	        }
	        return false;
	    }
	    
	    public void explore(int[][] grid, int x, int y, int a, int b) {
	        if ( x < 0 || y < 0 || x >= a || y >= b)
	            return;
	        if (visited[x][y] == false) {
	            visited[x][y] = true;
	            if (grid[x][y] == 1) {
	                current[x][y] = 1;
	                curSize++;
	                explore(grid, x - 1, y, a, b);
	                explore(grid, x, y - 1, a, b);
	                explore(grid, x + 1, y, a, b);
	                explore(grid, x, y + 1, a, b);
	            }
	        }
	    }
	}
}
