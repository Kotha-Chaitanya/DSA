class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int area=0;
        int max=0;
        while(i<j)
        {
            int b=Math.min(height[i],height[j]);
            int l=j-i;
            area=l*b;
            max=Math.max(max,area);
            if(height[i]<height[j])
            i++;
            else
            j--;
        }
        return max;
    }
}