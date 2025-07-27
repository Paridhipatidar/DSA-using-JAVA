class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // In the increasing part, so move right
                start = mid + 1;
            } else {
                // In the decreasing part, maybe mid is the peak
                end = mid;
            }
        }

        // start == end is the peak index
        return start;
    }
}
