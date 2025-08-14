class MinNoOfDaysToMakeMBouquets {
    public int minDays(int[] bloomDay, int m, int k) {
        long flowerReq = (long) m * k; // Use long to avoid overflow
        if (bloomDay.length < flowerReq) {
            return -1; // Not enough flowers
        }

        // Find the search range (min bloom day to max bloom day)
        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            minDay = Math.min(minDay, day);
            maxDay = Math.max(maxDay, day);
        }

        // Binary search on the number of days
        int result = -1;
        while (minDay <= maxDay) {
            int mid = minDay + (maxDay - minDay) / 2;

            if (canMake(bloomDay, m, k, mid)) {
                result = mid;
                maxDay = mid - 1; // Try earlier days
            } else {
                minDay = mid + 1; // Need more days
            }
        }
        return result;
    }

    // Helper function to check if we can make m bouquets in 'days'
    private boolean canMake(int[] bloomDay, int m, int k, int days) {
        int bouquets = 0;
        int flowers = 0;

        for (int bloom : bloomDay) {
            if (bloom <= days) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0; // Reset if flower not bloomed
            }
        }
        return bouquets >= m;
    }
}
