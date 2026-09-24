class Solution {
    public double minPrice(int[] p, int[] d) {
        Arrays.sort(p);
        Arrays.sort(d);
        int i=p.length-1;
        int j=d.length-1;
        double s=0;
        while(i>=0 && j>=0)
        {
            double dis=p[i]*(100.0-d[j])/100.0;
            s=s+dis;
            i--;
            j--;
        }
        while(i>=0)
        {
         s=s+p[i];
         i--;
        }
        return s;
    }
}