class Solution {
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        String key="aeiouAEIOU";
        while(i<j)
        {
            if(key.indexOf(arr[i])==-1)
            {
                i++;
            }
            else if(key.indexOf(arr[j])==-1)
            {
                j--;
            }
            else
            {
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            
        }
      return new String(arr);
    }
}