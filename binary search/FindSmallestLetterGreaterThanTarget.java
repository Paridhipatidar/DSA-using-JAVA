class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] <= target) {
                left = mid + 1;  // we need strictly greater
            } else {
                right = mid - 1;
            }
        }

        // If left goes out of bounds, wrap around to index 0
        return letters[left % letters.length];
    }
}
