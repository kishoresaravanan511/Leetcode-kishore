// Last updated: 8/11/2026, 2:17:40 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;

        if((int)target >= 122)  return letters[0];
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            l.add((int)letters[i]);
        }

        //System.out.print(s);
        
        int tar = (int)target;

        int[] arr = new int[l.size()];
        for(int j=0;j<arr.length;j++)
        {
            arr[j] = l.get(j);
        }

        if(isMin(arr,tar) == tar)
        {
            return (char)arr[1];
        }

        if(isMin(arr,tar) == Integer.MAX_VALUE)
        {
            return letters[0];
        }
        return (char)isMin(arr,tar);
    }
    int isMin(int[] arr,int tar)
    {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>tar && arr[i]<min)
            {
                min = arr[i];
            }
        }
        return min;
    }
    
}