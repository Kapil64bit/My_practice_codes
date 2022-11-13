public class stringToInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("21474836460"));

    }
    public static int myAtoi(String s) {
        if(s == null) return 0;

        s = s.trim();
        if(s.length() == 0) return 0;

        long result = 0;
        int sign = 1;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        if(s.charAt(0) == '-') sign =-1;
        int i = (s.charAt(0) == '+' ||s.charAt(0) == '-' )?1:0;

        while(i < s.length()){
            if(!Character.isDigit(s.charAt(i))) break;
            result = result * 10 + (s.charAt(i) - '0');

            if( sign == -1 && result *-1 < min ) return min;
            if( sign == 1 && result > max ) return max;

            i++;
        }

        return (int)result*sign;

    }

}
