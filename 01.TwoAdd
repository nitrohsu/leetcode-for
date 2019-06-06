class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int length = nums.length;
        HashMap<Integer,Integer> restMap = new HashMap<>(length);
        for (int i = 0; i < length; i++) {
            if (restMap.containsKey(nums[i])){
                return new int[]{restMap.get(nums[i]),i};
            }
            int rest = target - nums[i];
            restMap.put(rest,i);
        }

        return new int[0];
    }
}
