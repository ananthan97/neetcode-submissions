class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for(String s : strs){
            int[] charCount = new int[26];
            for(char ch: s.toCharArray()){
                charCount[ch - 'a']++;
            }
            String key = Arrays.toString(charCount);
            anagramMap.putIfAbsent(key, new ArrayList<>());
            anagramMap.get(key).add(s);
        }
        return new ArrayList<>(anagramMap.values());
    }
}
