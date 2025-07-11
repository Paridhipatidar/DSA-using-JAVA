class CountItemMatchingRule{
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int keyIndex = 0;
        // Determine which column to check based on ruleKey
        if (ruleKey.equals("color")) {
            keyIndex = 1;
        } else if (ruleKey.equals("name")) {
            keyIndex = 2;
        }
        int count = 0;
        // Linear search through each item
        for (List<String> item : items) {
            if (item.get(keyIndex).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
