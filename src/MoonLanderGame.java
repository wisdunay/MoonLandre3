import com.cs.engine.cell.Color;
import com.cs.engine.cell.Game;

public class MoonLanderGame extends Game {
    private static final int WIDTH = 64;
    private static final int HEIGHT = 64;
    private GameObject landscape;
    private Rocket  rocket;

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    private void createGame() {
        createGameObjects();
        drawScene();
    }

    private void createGameObjects() {
        landscape = new GameObject(0, 25, ShapeMatrix.LANDSPACE);
        rocket = new Rocket(WIDTH/2, 0);
    }

    private void drawScene() {
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                setCellColor(x,y, Color.DARKBLUE);
            }
        }
        landscape.draw(this);
        rocket.draw(this);

    }
}
