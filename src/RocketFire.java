import com.cs.engine.cell.Game;

import java.util.List;

public class RocketFire extends GameObject{
    private List<int[][]> matrixList;
    private boolean isVisible;
    private int frameIndex;

    public RocketFire (List<int[][]> matrixList){
        super(0,0, matrixList.get(0));
        this.matrixList = matrixList;
        frameIndex = 0;
        isVisible = false;
    }
    public void show(){
        isVisible= true;
    }
    public void hide(){
        isVisible = false;
    }

    @Override
    public void draw(Game game) {
        if (!isVisible)return;
        nextFrame();
        super.draw(game);
    }

    private void nextFrame() {
        frameIndex++;
        if (frameIndex >= matrixList.size()) frameIndex = 0;
    setMatrix(matrixList.get(frameIndex));
    }
}
