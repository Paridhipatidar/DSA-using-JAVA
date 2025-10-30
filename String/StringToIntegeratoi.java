class StringToIntegeratoi {
    public int myAtoi(String s) {
        s = s.trim();                // remove spaces from start and end
        if (s.isEmpty()) return 0;   // if string is empty, return 0

        int sign = 1;                // assume positive
        int i = 0;                   // index to loop through string

        // check if number has + or - sign
        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        String numStr = "";
        // read digits until a non-digit appears
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            numStr += s.charAt(i);
            i++;
        }

        if (numStr.isEmpty()) return 0; // if no digits found, return 0

        // convert to integer
        int num = Integer.parseInt(numStr);

        return num * sign;
    }
}
