class Solution {
    public List<String> buildArray(int[] t, int n) {
        ArrayList<String >list=new ArrayList<>();
        int arr[]=new int[n];
        for(int i=1;i<=arr.length;i++)
        {
            for(int j=0;j<t.length;j++)
            {
                if(i==t[j])
                {
                    list.add("Push");
                    break;
                }
                else if(i<t[j])
                {
                    list.add("Push");
                    list.add("Pop");
                    break;
                }
                
            }
        }
        return list;

    }
}