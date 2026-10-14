class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
         if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] newarr = new int[m][n];
        int s = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                newarr[i][j] = original[s];
                s++;
            }
        }
        return newarr;
    }
}