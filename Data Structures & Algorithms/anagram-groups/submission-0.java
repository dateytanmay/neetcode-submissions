class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            int chars[] = new int[26];
            for(char c : str.toCharArray()){
                chars[c-'a']++;
            }

            String key = Arrays.toString(chars);
            map.computeIfAbsent(key, k->new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
