class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        // Step 1: count frequency of s1
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }
        int window = s1.length();
        // Step 2: start sliding window over s2
        for (int i = 0; i < s2.length(); i++) {
            s2Count[s2.charAt(i) - 'a']++;
            // shrink the window if it's too big
            if (i >= window) {
                s2Count[s2.charAt(i - window) - 'a']--;
            }
            // Step 3: compare arrays
            if (matches(s1Count, s2Count)) {
                return true;
            }
        }
        return false;
    }

    // Helper function to check if two arrays match
    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
