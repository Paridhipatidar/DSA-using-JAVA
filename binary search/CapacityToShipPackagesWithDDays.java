public class CapacityToShipPackagesWithDDays {
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight = 0, sumWeight = 0;

        // Find lower and upper bounds
        for (int w : weights) {
            maxWeight = Math.max(maxWeight, w);
            sumWeight += w;
        }

        int low = maxWeight, high = sumWeight;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canShip(weights, days, mid)) {
                high = mid; // Try smaller capacity
            } else {
                low = mid + 1; // Need more capacity
            }
        }
        return low;
    }

    private boolean canShip(int[] weights, int days, int capacity) {
        int dayCount = 1, currentLoad = 0;

        for (int w : weights) {
            if (currentLoad + w > capacity) {
                dayCount++;
                currentLoad = 0;
            }
            currentLoad += w;

            if (dayCount > days) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ShipWithinDays obj = new ShipWithinDays();
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(obj.shipWithinDays(weights, days)); // Output: 15
    }
}
