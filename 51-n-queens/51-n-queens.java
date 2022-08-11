class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        helper(0, new ArrayList<>(), n, result);
        return result;
    }

    void helper(int index, List<Integer> list, int n, List<List<String>> result) {
        if (index == n) {
            result.add(makeList(list, n));
            return;
        }

        boolean[] block = new boolean[n]; // blocking in current row
        for (int i = 0; i < list.size(); i++) {
            int queenPos = list.get(i);
            int rowDiff = index - i;

            block[queenPos] = true; // vertical

            if (queenPos - rowDiff >= 0)
                block[queenPos - rowDiff] = true; // current row left diagonally
            if (queenPos + rowDiff < block.length)
                block[queenPos + rowDiff] = true; // current row right diagonally
        }

        for (int i = 0; i < n; i++) {
            if (block[i])
                continue;

            list.add(i);
            helper(index + 1, list, n, result);
            list.remove(list.size() - 1);
        }
    }

    List<String> makeList(List<Integer> list, int n) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (list.get(i) == j)
                    str.append("Q");
                else
                    str.append(".");
            }
            result.add(str.toString());
        }

        return result;
    }
}