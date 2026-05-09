class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        List<Integer>[] bucket = new ArrayList[nums.length+1];
        for(int key : map.keySet()){
            int f = map.get(key);
            if(bucket[f]==null){
                bucket[f] = new ArrayList<>();
            } 
            bucket[f].add(key);
        }
        List<Integer> res = new ArrayList<>();
        for(int i=bucket.length-1;i>=0 && res.size()<k;i--){
            if(bucket[i]!=null){
                res.addAll(bucket[i]);
            }
        }

        int resArr[] = new int[k];
        for(int i=0;i<k;i++){
            resArr[i] = res.get(i);
        }

        return resArr;
    }
}
