// Last updated: 8/11/2026, 2:15:35 PM
class Solution {
    public int[] decrypt(int[] code, int k) {
    int n=code.length;
    int[] ans = new int[n];
    int sum=0;
    int st = 0;
    int end = 0;

    if(k==0)
    {
        return ans;   //replaced by 0...
    }


    else if(k>0)
    {
    st = 1;
    end = k;
    for(int i=st;i<=end;i++)
    {
        sum+=code[i%n];//manual window...
    }   
    
    for(int i=0;i<n;i++)
    {
        ans[i] = sum;
        sum = sum-code[st%n];
        st++;
        end++;
        sum = sum+code[end%n];
    }
    }

    else if(k<0)
    {
        k=-k;  //converted to positive
        st = n-k;
        end = n-1;

        for(int i=st;i<=end;i++)
        {
            sum+=code[i%n];   //manual window for negative case...
        }

        for(int i=0;i<n;i++)
        {
            ans[i] = sum;

            sum=sum-code[st%n];
            st++;

            end++;
            sum=sum+=code[end%n];
        }
    }
    return ans;
    }
}