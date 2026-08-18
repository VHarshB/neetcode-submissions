class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }

        Map<Character, integer> count = new hashmap<>();
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            chat tChar = t.chatAt(i);

            count.put(sChar, count.getOrDefault(sChar, 0) + 1);
            count.put(tChar, count.getOrDefault(tChar, 0) + 1);
        }

        for (int frequency : count:values()){
            if (frequency != 0){
                return false;
            }
        }

        return true;



    
    }
}
