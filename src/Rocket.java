import com.cs.engine.cell.Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rocket extends GameObject {

    private final RocketFire downFire;
    private final RocketFire rightFire;
    private final RocketFire leftFire;
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
        tempList = Arrays.asList(ShapeMatrix.FIRE_SIDE_1, ShapeMatrix.FIRE_SIDE_2);
        leftFire = new RocketFire(tempList);
        rightFire = new RocketFire(tempList);
    }

    @Override
    public void draw(Game game) {
        super.draw(game);
        downFire.draw(game);
        leftFire.draw(game);
        rightFire.draw(game);
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
        switchFire(isUpPressed);
        switchFire(isUpPressed, isLeftPressed, isRightPressed);
    }

    private void switchFire(boolean isUpPressed) {
        if (isUpPressed) {
            downFire.setX(getX() + getWidth() / 2);
            downFire.setY(getY() + getHeight());
            downFire.show();
        } else {
            downFire.hide();
        }
    }

    private void switchFire(boolean isUpPressed, boolean isLeftPressed, boolean isRightPressed) {
        if (isLeftPressed) {
            leftFire.setX(getX() - 1);
            leftFire.setY(getY() + getHeight());
            leftFire.show();
        } else {
            leftFire.hide();
        }

        if (isRightPressed) {
            rightFire.setX(getX() + 5);
            rightFire.setY(getY() + getHeight());
            rightFire.show();
        } else {
            rightFire.hide();
        }
    }

    private void checkBorders() {
        if (getX() < LEFT_BORDER+1) setX(LEFT_BORDER+1);
        if (getX() > RIGHT_BORDER - getWidth()) setX(RIGHT_BORDER - getWidth());
        if (getY() < UP_BORDER+1) setY(UP_BORDER+1);
    }
}
