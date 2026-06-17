import java.util.Random;

public class GameOfLife {
    final static int WIDTH = 100, HIEGHT = 20;

    public static int[][] randomSeed() {
        int[][] tmp = new int[HIEGHT][WIDTH];
        Random rand = new Random();

        for (int i = 0; i < tmp.length; i++) {
            for (int j = 0; j < tmp[i].length; j++) {
                tmp[i][j]= rand.nextInt(2);
            }
        }

        return tmp;

    }

    public static void main(String[] args) {
        int[][] world = randomSeed();
        for (int i= 0; i < world.length; i++) {
            for (int j = 0; j < world[i].length; j++) {
                System.out.print(world[i][j]);
            }
            System.out.println();
        }
    }
}
