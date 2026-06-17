import java.util.Random;

public class GameOfLife {
    final static int WIDTH = 100, HEIGHT = 20;


    public static int[][] epoch(int world[][]) {
        int[][] newPopulation = new int[HEIGHT][WIDTH];
        // looking each cell
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[i].length; j++) {
                newPopulation[i][j] = fitness(i, j, world);
            }

        }
        return newPopulation;

    }

    public static int countAliveNeighbors(int row, int col, int[][] world) {
        int aliveNeigbors = 0;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col -1; j <= col + 1; j++) {
                if (exists(i, j)) {
                    if (world[i][j] == 1) {
                        aliveNeigbors++;
                    }

                }

            }
        }
        if (world[row][col] == 1) {
            aliveNeigbors--;

        }

        return aliveNeigbors;
    }


    public static int fitness(int row, int col, int[][] grid) {
        // get neighbors
        // apply the rules

        return grid[row][col] == 1 ? 1 : 0;
    }

    public static int[][] randomSeed() {
        int[][] tmp = new int[HEIGHT][WIDTH];
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
