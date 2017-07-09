public class Solution {
    public int[][] prettyPrint(int A) {
        int m = ((A-1) * 2) + 1;
        int[][] result = new int[m][m];
        for (int i = 0; i<m; i++) {

            for (int j = 0; j <m; j++) {
                if (Math.abs((m/2) -i) != 0 && Math.abs((m/2) -i) > Math.abs((m/2) -j)) {
                    result[i][j] = 1+ Math.abs((m/2) -i);
                } else {
                    result[i][j] = 1+ Math.abs((m/2) -j);
                }
            }
        }
        return result;
    }
}
