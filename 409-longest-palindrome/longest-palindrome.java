class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> m = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            m.put(ch, m.getOrDefault(ch, 0) + 1);
        }

        int ans = 0;
        boolean odd = false;

        for (int count : m.values()) {

            ans += (count / 2) * 2;

            if (count % 2 == 1)
                odd = true;
        }

        if (odd)
            ans++;

        return ans;
    }
}