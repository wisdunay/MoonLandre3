import com.cs.engine.cell.Color;
import com.cs.engine.cell.Game;
import com.cs.engine.cell.Key;

public class MoonLanderGame extends Game {
    private static final int WIDTH = 64;
    private static final int HEIGHT = 64;
    private GameObject landscape;
    private Rocket  rocket;
    private boolean isUpPressed;
    private boolean isLeftPressed;
    private boolean isRightPressed;

    public static int getWidth() {
        return WIDTH;
    }

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    private void createGame() {
        createGameObjects();
        drawScene();
        setTurnTimer(50);
        isUpPressed = false;
        isLeftPressed = false;
        isRightPressed = false;
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

    public void setCellColor(int x, int y, Color color){
        if(!(x<0||y<0|| x>WIDTH-1|| y>HEIGHT-1))
        super.setCellColor(x,y,color);
    }

    @Override
    public void onTurn(int step) {
        rocket.move(isUpPressed, isLeftPressed, isRightPressed);
        drawScene();

    }

    @Override
    public void onKeyPress(Key key) {
        if (key == Key.UP) isUpPressed = true;
        if (key == Key.LEFT){
            isRightPressed = false;
            isLeftPressed = true;
        }
        if (key == Key.RIGHT){
            isLeftPressed = false;
            isRightPressed = true;
        }
    }

    @Override
    public void onKeyReleased(Key key) {
        if (key== Key.UP){
isUpPressed = false;
isRightPressed = false;
isLeftPressed = false;
        }
    }
}
