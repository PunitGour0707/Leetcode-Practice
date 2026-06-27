class Solution {
    public boolean isValidSudoku(char[][] arr) {
        HashSet<Character> st;
        for (int i = 0; i < 9; i++) {
            st = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] != '.')
                    if (!st.add(arr[i][j]))
                        return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            st = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (arr[j][i] != '.')
                    if (!st.add(arr[j][i]))
                        return false;
            }
        }
        int i = 0;
        while (i < 9) {
            int j = 0;
            while (j < 9) {
                st = new HashSet<>();
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        if (arr[x][y] != '.')
                            if (!st.add(arr[x][y]))
                                return false;
                    }
                }
                j = j + 3;
            }
            i = i + 3;
        }
        return true;
    }
}