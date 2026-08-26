class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);
            String sort_s = new String(s);
            if (!map.containsKey(sort_s)) {
                map.put(sort_s, new ArrayList<>());
            }
            map.get(sort_s).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
