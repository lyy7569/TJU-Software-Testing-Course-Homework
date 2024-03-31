import java.util.Arrays;

public class BackPack {
    public static int[] backPack(int[] w, int[] v, int c) {
        int n = w.length;
        int[] result = new int[n + 2]; // [0]: maxValue, [1:n]: selected items, [n+1]: maxWeight
        if(n != v.length){
            return result;
        }
        for (int value : w) {
            if (value < 0) {
                return result;
            }
        }
        for (int k : v) {
            if (k < 0) {
                return result;
            }
        }
        if(c < 0) {
            return result;
        }
        if(c == Integer.MAX_VALUE){
            for(int i = 0; i < w.length; i++){
                result[n+1] += w[i];
                result[i+1] = 1;
                result[0] += v[i];
            }
            return result;
        }
        int[][]dp= new int[n + 1][c + 1];
        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < c + 1; j++){
                if(w[i - 1] > j){
                    dp[i][j] = dp[i - 1][j];
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j], v[i - 1] + dp[i - 1][j - w[i - 1]]);
                }
            }
        }

        int maxValue = dp[n][c];
        result[0] = maxValue;
        int m = c;
        int maxWeight = 0;
        for (int i = n; i > 0 && maxValue > 0; i--) {
            if (maxValue != dp[i - 1][m]) {
                result[i] = 1;
                maxValue -= v[i - 1];
                m -= w[i - 1];
                maxWeight += w[i - 1];
            }
        }
        result[n + 1] = maxWeight;
        return result;
    }
}
