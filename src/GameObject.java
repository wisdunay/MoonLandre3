import com.cs.engine.cell.Color;
import com.cs.engine.cell.Game;

public class GameObject {
    private final int height;
    private final int width;
    double x;
    double y;
    int[][] matrix;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public GameObject(double x, double y, int[][] matrix) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
        height = matrix.length;
        width = matrix[0].length;

    }
    public void draw(Game game){
        if (matrix==null){
            return;
        }
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int cI = matrix[j][i];
                //TODO mistake
                game.setCellColor(i+(int)x, j+(int)y, Color.values()[cI]);
            }
        }
    }
}
