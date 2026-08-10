class Solution {
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            if(!(isVowel(arr[i])))
            i++;
            else if(!(isVowel(arr[j])))
            j--;
            else
            {
                char c=arr[i];
                arr[i]=arr[j];
                arr[j]=c;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
    public boolean isVowel(char t)
    {
        t = Character.toLowerCase(t);
        if(t=='a'|| t=='e' || t=='i' || t=='o' || t=='u')
        {
            return true;
        }
        return false;
    }
}