// Last updated: 8/11/2026, 2:13:45 PM
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int stSec = convertToSeconds(startTime);
        int endSec = convertToSeconds(endTime);

        return endSec - stSec;
    }
    int convertToSeconds(String str)
    {
        String[] arr = str.split(":");
        int hrs = Integer.parseInt(arr[0]);
        int mins = Integer.parseInt(arr[1]);
        int sec = Integer.parseInt(arr[2]);

        return (hrs*3600)+(mins*60)+sec;
    }
}