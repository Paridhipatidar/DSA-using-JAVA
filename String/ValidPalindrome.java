class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // Step 1: Normalize
        s = s.trim().toLowerCase();
        // Step 2: Remove non-alphanumeric
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "");
        // Step 3: Two-pointer check
        int left = 0;
        int right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
