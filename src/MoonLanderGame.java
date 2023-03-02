import com.cs.engine.cell.Color;
import com.cs.engine.cell.Game;
import com.cs.engine.cell.Key;

public class MoonLanderGame extends Game {
    private static final int WIDTH = 64;
    private static final int HEIGHT = 64;
    private GameObject landscape;
    private GameObject platform;
    private Rocket rocket;
    private boolean isUpPressed;
    private boolean isLeftPressed;
    private boolean isRightPressed;
    private boolean isGameStopped;
    private int score;

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
        isGameStopped = false;
        score = 1000;
        setScore(score);
        drawScene();
    }

    private void createGameObjects() {
        landscape = new GameObject(0, HEIGHT - ShapeMatrix.LANDSPACE.length, ShapeMatrix.LANDSPACE);
        rocket = new Rocket(WIDTH / 2, 0);
        platform = new GameObject(23, HEIGHT - 1, ShapeMatrix.PLATFORM);
    }

    private void drawScene() {
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                setCellColor(x, y, Color.DARKBLUE);
            }
        }
        landscape.draw(this);
        rocket.draw(this);
        platform.draw(this);

    }

    public void setCellColor(int x, int y, Color color) {
        if (!(x < 0 || y < 0 || x > WIDTH - 1 || y > HEIGHT - 1))
            super.setCellColor(x, y, color);
    }

    @Override
    public void onTurn(int step) {
        if(score != 0) {
            rocket.move(isUpPressed, isLeftPressed, isRightPressed);
            check();
            score -= 3;
            setScore(score);
            drawScene();
        } else {
            gameOver();
        }
    }

    private void check() {
        if (rocket.isCollision(landscape) && !rocket.isCollision(platform)) {
            gameOver();
        }
        if (rocket.isCollision(platform) && rocket.isStopped()){
            win();
        }
    }

    private void win() {
        rocket.land();
        isGameStopped = true;
        showMessageDialog(Color.BLACK, "Победа!", Color.BLUE,  50);
        stopTurnTimer();
    }

    private void gameOver() {
        rocket.crash();
        isGameStopped = true;
        showMessageDialog(Color.BLACK, "Проигрыш", Color.RED, 50);
        stopTurnTimer();
    }


    @Override
    public void onKeyPress(Key key) {
        if (key == Key.UP) isUpPressed = true;
        if (key == Key.LEFT) {
            isRightPressed = false;
            isLeftPressed = true;
        }
        if (key == Key.RIGHT) {
            isLeftPressed = false;
            isRightPressed = true;
        }
    }

    @Override
    public void onKeyReleased(Key key) {
        if (key == Key.UP) isUpPressed = false;
        if (key == Key.LEFT) {
            isLeftPressed = false;
        }
        if (key == Key.RIGHT) {
            isRightPressed = false;
        }
    }
}
