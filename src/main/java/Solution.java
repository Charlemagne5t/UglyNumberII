class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];

        int i = 0;
        int j = 0;
        int k = 0;

        dp[0] = 1;

        int index = 1;

        while (index != n) {
            int num = Math.min(dp[i] * 2, Math.min(dp[j] * 3, dp[k] * 5));
            dp[index] = num;
            if (dp[i] * 2 == num) {

                i++;
            }
            if (dp[j] * 3 == num) {
                j++;
            }
            if (dp[k] * 5 == num) {
                k++;
            }
            index++;
        }


        return dp[n - 1];
    }
}