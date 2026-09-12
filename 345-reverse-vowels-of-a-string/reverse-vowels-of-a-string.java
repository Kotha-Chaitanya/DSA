class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<=j)
        {
            if(!isVowel(arr[i]))
            {
                i++;
            }
            else if(!isVowel(arr[j]))
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

    public boolean isVowel(char x)
    {
        x=Character.toLowerCase(x);
        if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u')
        {
            return true;
        }
        return false;
    }
}