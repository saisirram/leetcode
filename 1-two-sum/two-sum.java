class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> prevDiffMap = new HashMap<>();
    //    for(int i : nums) {
    //     frequencies.put(i, frequencies.getOrDefault(i, 0) + 1);
    //    }
        for(int i = 0; i < nums.length; i++) {
           int num = nums[i];
           int diff = target - num;
           // it the difference of target and num is present in the map then return the index of diff and i as an array.
           if (prevDiffMap.containsKey(diff)) {
            return new int[] {prevDiffMap.get(diff), i};
           }
           // store the value of the current number and its index
           prevDiffMap.put(num, i);
        }
        return new int[] {};
    }
}