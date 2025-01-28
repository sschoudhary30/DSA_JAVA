/*class Solution {
    public int myAtoi(String s) {

        s= s.trim();

        if(s.isEmpty()){
            return 0;
        }

        int sign = 1;
        int index = 0;

        if(s.charAt(0)== '-'){
            sign = -1;
            index++;
        }else if(s.charAt(0)=='+'){
            index++;

        }

        long result = 0;
        while(index < s.length() && Character.isDigit(s.charAt(index))){

            result = result * 10 + (s.charAt(index)-'0');
            index++;

        }

        result *= sign;

        if (result < Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (result > Integer.MAX_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) result;

        
    }
}
*/
class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        int sign = 1;
        int result = 0;

        // Step 1: Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Check for sign
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            } else {
                sign = 1;
            }
            i++;
        }

        // Step 3: Convert digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';  // Convert character to digit

            // Step 4: Check for overflow
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }

            result = result * 10 + digit;
            i++;
        }

        // Step 5: Return the final result with sign
        return result * sign;
    }
}