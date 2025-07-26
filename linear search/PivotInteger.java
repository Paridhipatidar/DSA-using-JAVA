class PivotInteger {
    public int pivotInteger(int n) {
        int total = n * (n + 1) / 2;
        
        // Try to find x such that x^2 = total
        int x = (int)Math.sqrt(total);
        
        if (x * x == total) {
            return x;
        } else {
            return -1;
        }
    }
}
