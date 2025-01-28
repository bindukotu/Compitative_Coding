package leetcode;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaximumnoofMoviesinGrid {
    public static void main(String[] args) {
       int[][] n={{2,4,3,5},{5,4,9,3},{3,4,2,11},{10,9,13,15}};
        System.out.println(maxMoves(n));
    }
//    public static int maxMoves(int[][] grid) {
//        int m = grid.length, n = grid[0].length;
//        System.out.println(m);
//        Set<Integer> q = IntStream.range(0, m).boxed().collect(Collectors.toSet());
//        for (int j = 0; j < n - 1; ++j) {
//            Set<Integer> t = new HashSet<>();
//            for (int i : q) {
//                System.out.println(q);
//                for (int k = i - 1; k <= i + 1; ++k) {
//                    if (k >= 0 && k < m && grid[i][j] < grid[k][j + 1]) {
//                        t.add(k);
//                        System.out.println(t);
//                    }
//                }
//            }
//            if (t.isEmpty()) {
//                return j;
//            }
//            q = t;
//        }
//        return n - 1;
//
//    }
    public static int solve(int x, int y, int[][] grid, int n, int m){
        if(x<0 || y<0 ||  x>=n ||y>=m){
            return 0;
        }
        if(y==m-1){
            return 1;
        }
        int up=0,dia=0,right=0;
        int val=grid[x][y];
        grid[x][y]=0;
        if(x>0 && y+1<m && grid[x-1][y+1]>val){
            up=solve(x-1,y+1,grid,n,m);
        }
        if(x+1<n && y+1<m && grid[x+1][y+1]>val){
            dia=solve(x+1,y+1,grid,n,m);
        }
        if(x>=0 && y+1<m && grid[x][y+1]>val){
            right=solve(x,y+1,grid,n,m);
        }
        return 1+ Math.max(up,Math.max(dia,right));
    }
    public static int maxMoves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int i=0;i<n;i++)
            ans=Math.max(ans,solve(i,0,grid,n,m)-1);
        return ans;
    }

}
