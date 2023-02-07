public class ShapeMatrix {
    public static final int[][] LANDSPACE = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 3, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 3, 0, 0, 0, 0, 0, 0},
            {3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 3, 0, 0, 0, 0, 0, 0},
            {3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0},
            {0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0},
            {0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0},
            {0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 0, 0},
            {0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 0, 0},
            {0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 3, 0, 0, 0, 0},
            {0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 3, 0, 0, 0, 0},
            {0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 3, 0, 0, 0, 0},
            {0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 3, 0, 0, 0, 0},
            {0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0},
            {0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0},
            {0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0},
            {0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10},
            {10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34},
            {10, 10, 10, 34, 10, 10, 34, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10},
            {10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10},
            {10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34},
            {10, 10, 10, 34, 10, 10, 34, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10},
            {10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10},
            {10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34},
            {10, 10, 10, 34, 10, 10, 34, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10},
            {10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10},
            {10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34},
            {10, 10, 10, 34, 10, 10, 34, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10},
            {10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10},
            {10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34},
            {10, 10, 10, 34, 10, 10, 34, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10},
            {10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10},
            {10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34},
            {10, 10, 10, 34, 10, 10, 34, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10},
            {10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10},
            {10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34},
            {10, 10, 10, 34, 10, 10, 34, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10},
            {10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10},
            {10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34},
            {10, 10, 10, 34, 10, 10, 34, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 10, 34, 10, 10},
            {10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 34, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10, 10, 10, 10, 34, 10, 10}
    };
    public static final int[][] ROCKET = {
            {0,0,0,4,0,0,0 },
            {0,0,4,4,4,0,0 },
            {0,0,4,0,4,0,0 },
            {0,0,4,4,4,0,0 },
            {0,0,4,0,4,0,0 },
            {0,0,4,4,4,0,0 },
            {0,4,4,4,4,4,0 },
            {4,4,4,4,4,4,4 },
            {4,0,0,4,0,0,4 },


    };
    public static final int[][] ROCKET_CRASH = {
            {0,0,0,4,0,0,0 },
            {0,0,4,4,4,0,0 },
            {0,0,1,0,4,0,0 },
            {0,0,4,4,4,0,0 },
            {0,0,4,0,4,0,0 },
            {0,0,5,4,5,0,0 },
            {0,5,4,1,4,4,0 },
            {5,4,1,4,1,5,4 },
            {1,0,0,5,0,0,4 },


    };
}
