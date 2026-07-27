class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /* Brute Force Approach
        Map<String, List<String>> map = new HashMap<>();

        for (int i=0; i<strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(map.values());
        */
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }

        return new ArrayList<>(res.values());

        
        
    }
}
