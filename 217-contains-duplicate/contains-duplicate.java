class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num: nums) {
            if (frequency.get(num) != null) {
                return true;
            } else {
                frequency.put(num, 1);
            }
        }
        return false;
        
    }
}