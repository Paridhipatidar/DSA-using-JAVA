public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        
        while (low < high) {
            int mid = low + (high - low) / 2; // avoid overflow
            if (isBadVersion(mid)) {
                high = mid; // possible answer, but look left
            } else {
                low = mid + 1; // look right
            }
        }
        
        return low; // or high (both are same here)
    }
}
