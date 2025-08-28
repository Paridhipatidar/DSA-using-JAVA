
public class ThirdMaxNumber {
    public int thirdMax(int[] nums) {
        // Step 1: Remove duplicates using a Set
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Step 2: Convert set back to array
        int[] distinct = new int[set.size()];
        int i = 0;
        for (int num : set) {
            distinct[i++] = num;
        }

        // Step 3: Sort the distinct array
        Arrays.sort(distinct);

        // Step 4: If we have at least 3 distinct numbers, return third maximum
        if (distinct.length >= 3) {
            return distinct[distinct.length - 3];
        }
        // Otherwise, return the maximum
        return distinct[distinct.length - 1];
    }
}
