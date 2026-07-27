class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
                return false;
            }
        char[] chars1 = new char[s.length()];
        char[] chars2 = new char[t.length()];
        for (int i = 0; i < s.length(); i++) {
            chars1[i] = s.charAt(i);
            chars2[i] = t.charAt(i);
        }

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for (int j = 0; j < s.length(); j++) {
            if (chars1[j] != chars2[j]) {
                return false;
            }
        }
        return true;

        
    }
}
