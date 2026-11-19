class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
       int land=0;
       for(int i=0;i<grid2.length;i++)
       {
        for(int j=0;j<grid2[0].length;j++)
        {
            if(grid2[i][j]==1)
            {
            if(f(grid1,grid2,i,j))
            {
               land++;
            }
            }
        }
       }
       return land;
    }
    public boolean f(int [][]grid1,int [][]grid2,int i ,int j)
    {
        if(i<0 || j<0|| i>=grid2.length || j>=grid2[0].length)
        {
                return true;
        }
        if(grid2[i][j]==0)
        {
            return true;
        }
        grid2[i][j]=0;
        boolean x= (grid1[i][j]==1);
        boolean up=f(grid1,grid2,i+1,j);
        boolean down=f(grid1,grid2,i-1,j);
        boolean left=f(grid1,grid2,i,j+1);
       boolean right= f(grid1,grid2,i,j-1);
        return x && up && left && down && right;

    }

}