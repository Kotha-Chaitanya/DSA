class Solution {
    public int[] diStringMatch(String s) {
        int [] arr=new int[s.length()+1];
        int i=0;
        int j=0;
        int k=s.length();
        while(i<s.length())
        {
            if(s.charAt(i)=='I')
            {
                arr[i]=j;
                i++;
                j++;
            }
            else if(s.charAt(i)=='D')
            {
                arr[i]=k;
                i++;
                k--;
            }
        }
        arr[i]=j;
        return  arr;

    }
}