import com.cs.engine.cell.Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rocket extends GameObject {
    private final RocketFire downFire;
    private double speedY = 0;
    private double boost = 0.05;
    private double speedX = 0;
    private double slowDown = boost / 10;
    public static final int LEFT_BORDER = -1;
    public static final int RIGHT_BORDER = MoonLanderGame.getWidth();
    public static final int UP_BORDER = -1;

    public Rocket(double x, double y) {
        super(x, y, ShapeMatrix.ROCKET);
        List<int[][]> tempList = Arrays.asList(
                ShapeMatrix.FIRE_DOWN_1,
                ShapeMatrix.FIRE_DOWN_2,
                ShapeMatrix.FIRE_DOWN_3
        );
        downFire = new RocketFire(tempList);
    }

    @Override
    public void draw(Game game) {
        super.draw(game);
        downFire.draw(game);
    }

    public void move(boolean isUpPressed, boolean isLeftPressed, boolean isRightPressed) {
        if (isUpPressed) {
            speedY -= boost;
        } else {
            speedY += boost;
        }
        setY(getY() + speedY);
        if (isLeftPressed) {
            speedX -= boost;
            setX(getX() + speedX);
        } else if (isRightPressed) {
            speedX += boost;
            setX(getX() + speedX);

        } else if (speedX > slowDown) {
            speedX -= slowDown;
        } else if (speedX < -slowDown) {
            speedX += slowDown;
        } else {
            speedX = 0;
        }
        setX(getX() + speedX);
        checkBorders();
    }

    private void checkBorders() {
        if (getX() < LEFT_BORDER + 1) setX(LEFT_BORDER + 1);
        if (getX() > RIGHT_BORDER - getWidth()) setX(RIGHT_BORDER - getWidth());
        if (getY() < UP_BORDER + 1) setY(UP_BORDER + 1);
    }
}
