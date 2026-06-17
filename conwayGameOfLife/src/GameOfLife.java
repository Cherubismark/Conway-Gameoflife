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

    public static void render(int[][] world) {
        for (int i= 0; i < world.length; i++) {
            for (int j = 0; j < world[i].length; j++) {
                if (world [i][j] == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] world = randomSeed();
        render(world);

    }
}
