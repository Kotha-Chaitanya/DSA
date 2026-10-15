class Solution {
    public int maximumWealth(int[][] arr) {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            int s=0;
            for(int j=0;j<arr[i].length;j++)
            {
                s=s+arr[i][j];
            }
            max=Math.max(max,s);
        }
        return max;
    }
}