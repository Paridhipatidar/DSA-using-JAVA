class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            // Check if nums1[i] exists in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    // Check if nums1[i] is already in temp (to avoid duplicates)
                    boolean isDuplicate = false;
                    for (int k = 0; k < index; k++) {
                        if (temp[k] == nums1[i]) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        temp[index++] = nums1[i];
                    }
                    break; // break inner loop once match is found
                }
            }
        }
        // Copy result to final array of exact size
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}
