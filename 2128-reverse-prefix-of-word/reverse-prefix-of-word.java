class Solution {
    public String reversePrefix(String s, char ch) {
        char arr[]=s.toCharArray();
        int j=s.indexOf(ch);
        int i=0;
        while(i<j)
        {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
         return new String(arr);
    }
}