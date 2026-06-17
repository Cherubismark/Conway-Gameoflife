public class GameOfLife {
    final static int WIDTH = 100, HIEGHT = 20;

    public static void main(String[] args) {
        int[][] world = new int[HIEGHT][WIDTH];
        for (int i= 0; i < world.length; i++) {
            for (int j = 0; j < world[i].length; j++) {
                System.out.print(world[i][j]);
            }
            System.out.println();
        }
    }
}
