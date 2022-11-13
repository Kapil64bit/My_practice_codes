import java.util.*;

public class nQueens {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
    static Set<Integer> col = new HashSet<Integer>();
    static Set<Integer> diag1 = new HashSet<Integer>();
    static Set<Integer> diag2 = new HashSet<Integer>();

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<List<String>>();
        dfs(res,new ArrayList<String>(), 0, n);
        return res;
    }
     static void dfs(List<List<String>> res, List<String> list, int row, int n){
        if (row == n){
            res.add(new ArrayList<String>(list));
            return;
        }
        for (int i = 0; i < n; i++){
            if (col.contains(i) || diag1.contains(row + i) || diag2.contains(row - i)) continue;

            char[] charArray = new char[n];

            Arrays.fill(charArray, '.');
            charArray[i] = 'Q';
            String rowString = new String(charArray);

            list.add(rowString);
            col.add(i);
            diag1.add(row + i);
            diag2.add(row - i);

            dfs(res,list,row+1,n);

            list.remove(list.size()-1);
            col.remove(i);
            diag1.remove(row  + i);
            diag2.remove(row -i );
        }
    }
}