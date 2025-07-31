class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int[] freq1 = new int[26]; // frequency for string s
        int[] freq2 = new int[26]; // frequency for string t
        for (char c : s.toCharArray()) {
            freq1[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            freq2[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return (char) (i + 'a');  // convert index back to character
            }
        }
        return ' ';  // in case no difference found (should never happen)
    }
}
