class Solution {
    public List<String> buildArray(int[] t, int n) {
        ArrayList<String >list=new ArrayList<>();
        int j=0;
            for(int i=1;i<=n;i++)
            {
                if(i==t[j])
                {
                    list.add("Push");
                    j++;
                }
                else 
                {
                    list.add("Push");
                    list.add("Pop");
                   
                }
                if(j==t.length)
                {
                    break;
                }
                
            }
        
        return list;

    }
}