
class Solution {
	public  int dfs(int[][] grid,int i,int j) {
		if(grid[i][j]<=0) return 0;
		int result=0;
		int[] RowMovements= {1,-1,0,0};
		int[] ColMovements= {0,0,1,-1};
		grid[i][j]*=-1;
		for(int k=0;k<4;k++) {
			int row=i+RowMovements[k];
			int col=j+ColMovements[k];
			if(row>=0&&row<grid.length&&col>=0&&col<grid[0].length&&grid[row][col]>0)
				result=Math.max(result, grid[row][col]+dfs(grid,row,col));
		}
		grid[i][j]*=-1;
		
		return result;
	}
    public int getMaximumGold(int[][] grid) {
        	int result=0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(grid[i][j]>0)
					result=Math.max(result, grid[i][j]+dfs(grid,i,j));
			}
		}
		
		
		return result;
    }
}