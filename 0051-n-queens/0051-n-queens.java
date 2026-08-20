class Solution {
    static List<List<String>> list = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        list = new ArrayList<>();

        int[][] arr = new int[n][n];
        place(0, arr);
        return list;
    }

    private static void place(int row, int[][] arr) {
        if (row == arr.length) {
            print(arr);
            return;
        }
        for (int col = 0; col < arr.length; col++) {
            if (isSafe(row, col, arr)) {
                arr[row][col] = 1;
                place(row + 1, arr);
                arr[row][col] = 0;
            }
        }
    }

    private static boolean isSafe(int row, int col, int[][] arr) {
        int r = row;
        int c = col;

        //        Up
        while (r >= 0)
            if (arr[r--][c] == 1)
                return false;

        //        left diagonal
        r = row;
        while (r >= 0 && c >= 0)
            if (arr[r--][c--] == 1)
                return false;

        //        right diagonal
        r = row;
        c = col;
        while (r >= 0 && c < arr.length)
            if (arr[r--][c++] == 1)
                return false;

        return true;
    }

    private static void print(int[][] arr) {
        List<String> ans = new ArrayList<>();
        for (int row = 0; row < arr.length; row++) {
            String s = "";
            for (int col = 0; col < arr.length; col++)
                s += (arr[row][col] == 1 ? 'Q' : '.');
            ans.add(s);
        }
        list.add(ans);
    }
}