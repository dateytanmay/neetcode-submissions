class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int com = target - nums[i];
            if(map.containsKey(com)){
                com = map.get(com);
                return new int[]{com,i};
            }
            map.put(nums[i], i);
        }
        return new int[] {0};
    }
}
