class KoKoEatingBanana {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1; // minimum possible speed
        int right = 0; // maximum possible speed
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int ans = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(piles, h, mid)) {
                ans = mid; // possible answer
                right = mid - 1; // try smaller speed
            } else {
                left = mid + 1; // need more speed
            }
        }
        return ans;
    }

    private boolean canEatAll(int[] piles, int h, int k) {
        long hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k; // ceil(pile/k)
        }
        return hours <= h;
    }
}
