public class meets {
    public static int maxMeetings(int start[], int end[], int n)
    {
        if(n==0) return 0;
        if( n == 1) return 1;

        int i = 0;
        int j = i+1;
        int meets = 1;
        while(j<n){
            if(end[i] >= start[j] ){

                i++;
                j++;

            }
            else{
                meets++;
                i++;
                j++;
            }

        }
        return meets;

    }

    public static void main(String[] args) {
       int[] start = {1,3,0,5,8,5};
       int[] end =  {2,4,6,7,9,9};
       int n = start.length;
       maxMeetings(start,end,n);
    }
}
