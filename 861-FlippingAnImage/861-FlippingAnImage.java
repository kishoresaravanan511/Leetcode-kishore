// Last updated: 8/11/2026, 2:17:14 PM
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {
            image[i] = reverseArray(image[i]);
        }
        return image;
    }
    public int[] reverseArray(int[] arr)
    {
        int i=0;
        int j=arr.length-1;

        while(i<=j)
        {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
        for(int m=0;m<arr.length;m++)
        {
            if(arr[m] == 0)
            {
                arr[m] = 1;
            }
            else
            {
                arr[m] = 0;
            }
        }
        return arr;
    }
}