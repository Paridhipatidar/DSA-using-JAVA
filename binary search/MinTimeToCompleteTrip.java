class MinTimeToCompleteTrip {
    public long minimumTime(int[] time, int totalTrips) {
        long left = 1;
        long right = (long) Arrays.stream(time).min().getAsInt() * totalTrips;
        long ans = right;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (canComplete(time, mid, totalTrips)) {
                ans = mid;  // mid works, try smaller
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    private boolean canComplete(int[] time, long givenTime, int totalTrips) {
        long trips = 0;
        for (int bus : time) {
            trips += givenTime / bus;
            if (trips >= totalTrips) return true; // early stop
        }
        return trips >= totalTrips;
    }
}
