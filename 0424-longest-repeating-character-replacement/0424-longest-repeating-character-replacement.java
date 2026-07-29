class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            freq[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            int len = right - left + 1;
            int diff = len - maxFreq;

            while (diff > k) {

                freq[s.charAt(left) - 'A']--;
                left++;

                len = right - left + 1;
                diff = len - maxFreq;
            }

            ans = Math.max(ans, len);
        }

        return ans;
    }
}