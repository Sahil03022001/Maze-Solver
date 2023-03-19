import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class Pair {
    int row;
    int col;
    Pair(int r, int c){
        row = r;
        col = c;
    }
}

public class Maze extends JFrame {

    private int[][] maze;
    private ArrayList<Pair> paths;
    private boolean valid;

    public Maze(int[][] maze, int sr, int sc, int dr, int dc){
        this.maze = maze;
        paths = new ArrayList<>();
        valid = DepthFirst.findPaths(maze, sr, sc, dr, dc, paths);
        setTitle("MAZE SOLVER");
        setSize(640, 720);
        setBackground(Color.GRAY);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        g.translate(100,100);
        for(int i=0; i<maze.length; i++){
            for(int j=0; j<maze[0].length; j++){
                Color color;
                int value = maze[i][j];
                if(value == 0) color = Color.RED;
                else color = Color.WHITE;
                g.setColor(color);
                g.fillRect(40*j, 40*i, 40, 40);
                g.setColor(Color.BLACK);
                g.drawRect(40*j, 40*i, 40, 40);
            }
        }

        if(!valid) return;

        for(Pair p : paths){
            int i = p.row;
            int j = p.col;
            g.setColor(Color.GREEN);
            g.fillRect(40*j, 40*i, 40, 40);
            g.setColor(Color.BLACK);
            g.drawRect(40*j, 40*i, 40, 40);
        }
    }
}
