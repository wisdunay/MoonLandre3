import com.cs.engine.cell.Color;
import com.cs.engine.cell.Game;

public class GameObject {
    private final int height;
    private final int width;
    double x;
    double y;
    int[][] matrix;

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
