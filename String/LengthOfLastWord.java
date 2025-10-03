class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int count = 0;
        // Step 1: Skip trailing spaces using for loop
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && count == 0) {
                // Skip trailing spaces
                continue;
            }
            else if (s.charAt(i) != ' ') {
                // Count characters of last word
                count++;
            }
            else {
                // If we encounter space after counting, last word is done
                break;
            }
        }
        return count;
    }
}
