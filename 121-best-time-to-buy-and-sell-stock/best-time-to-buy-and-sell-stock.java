class Solution {
    public int maxProfit(int[] arr) {
        int max=0;
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            max=Math.max(max,arr[i]-min);
        }
        return max;
    }
}