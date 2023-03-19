import java.util.ArrayList;

public class DepthFirst {

    final private static int[] drow = {-1, 0, 1, 0};
    final private static int[] dcol = {0, 1, 0, -1};
    static public boolean findPaths(int[][] maze, int sr, int sc, int dr, int dc, ArrayList<Pair> paths){
        int n = maze.length;
        int m = maze[0].length;
        boolean[][] vis = new boolean[n][m];
        return helper(maze, sr, sc, dr, dc, paths, vis);
    }

    public static boolean helper(int[][] maze, int sr, int sc, int dr, int dc, ArrayList<Pair> paths, boolean[][] vis){
        if(sr == dr && sc == dc) {
            paths.add(new Pair(sr, sc));
            return true;
        }
        vis[sr][sc] = true;
        paths.add(new Pair(sr, sc));
        for(int k=0; k<4; k++){
            int nrow = sr+drow[k];
            int ncol = sc+dcol[k];
            if(nrow>=0 && nrow<maze.length && ncol>=0 && ncol<maze[0].length && !vis[nrow][ncol] && maze[nrow][ncol] == 1){
                if(helper(maze, nrow, ncol, dr, dc, paths, vis)) return true;
                else paths.remove(paths.size()-1);
            }
        }
        return false;
    }
}
