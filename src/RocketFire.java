import java.util.List;

public class RocketFire extends GameObject{
    private List<int[][]> matrixList;
    public RocketFire (List<int[][]> matrixList){
        super(0,0, matrixList.get(0));
        this.matrixList = matrixList;
    }
}
