class Solution {
    public int closedIsland(int[][] grid) {
         int land=0;
       for(int i=0;i<grid.length;i++)
       {
        for(int j=0;j<grid[0].length;j++)
        {
            if(grid[i][j]==0)
            {
            if(f(grid,i,j))
            {
               land++;
            }
            }
        }
       }
       return land;
    }
    public boolean f(int [][]grid,int i ,int j)
    {
        if(i<0 || j<0|| i>=grid.length || j>=grid[0].length)
        {
                return false;
        }
         if(grid[i][j]==1)
        {
            return true;
         }
         grid[i][j]=1;
        boolean up=f(grid,i+1,j);
        boolean down=f(grid,i-1,j);
        boolean left=f(grid,i,j+1);
       boolean right= f(grid,i,j-1);
        return  up && left && down && right;

    }
}