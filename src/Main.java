import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] maze = {
                {1 ,1 ,1 ,0 ,1, 1, 1, 1, 1, 1},
                {1, 1, 0, 0, 1, 0, 0, 1, 1, 0},
                {0, 1, 0, 0, 1, 0, 0, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0, 0, 0},
                {1, 0, 1, 0, 1, 1, 1, 0, 0, 1},
                {0, 0, 0, 0, 0, 1, 1, 1, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 0, 0, 0},
                {1, 0, 0, 0, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 1 ,0 ,1},
                {1, 1 ,1, 1, 1, 1, 1, 1, 1, 1},
        };

        int x = sc.nextInt();
        int y = sc.nextInt();
        int dr = sc.nextInt();
        int dc = sc.nextInt();
        Maze m1 = new Maze(maze, x, y, dr, dc);
    }
}