class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> res = new HaspMap<>();

        for (String s: strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            string sortedS = new String(charArray);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
        
    }
}
