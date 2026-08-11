// Last updated: 8/11/2026, 2:14:15 PM
class Solution {
    public int minimumGroups(String[] words) {
        Set<String> s = new HashSet<>();

        for(String word:words){
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for(int i=0;i<word.length();i++)
            {
                if(i%2==0)
                {
                    even.append(word.charAt(i));
                }
                else
                {
                    odd.append(word.charAt(i));
                }
            }
        String minEven = getMinShifts(even.toString());
        String minOdd = getMinShifts(odd.toString());

        String key = minEven+"#"+minOdd;
        s.add(key);
        }

        return s.size();
    }
    
    String getMinShifts(String s)
    {
        int n = s.length();
            if(n<=1)return s;
        String t= s+s;
        int i=0;int j =1;int k=0;

        while(i<n && j<n && k<n)
            {
                char a = t.charAt(i+k);
                char b = t.charAt(j+k);

                if(a==b)
                {
                    k++;
                }
                else if(a>b)
                {
                    i=i+k+1;
                    if(i<=j) i=j+1;
                    k=0;
                }
                else
                {
                    j=j+k+1;
                    if(j<=i) j=i+1;
                    k=0;
                }
            } 
        int st = Math.min(i,j);
        return t.substring(st,st+n);
    }

}