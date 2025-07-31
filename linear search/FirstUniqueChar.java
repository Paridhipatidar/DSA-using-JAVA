class FirstUniqueChar {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];

        // Count frequencies
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;  // ✅ index in the string
            }
        }

        return -1;
    }
}
