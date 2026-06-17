import java.util.Random;

public class GameOfLife {
    final static int WIDTH = 100, HEIGHT = 20;
    final static int ALIVE = 1, DEAD = 0;
    final static int LIVES = 1, DIES = 0;


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

    public static boolean exists(int row, int col) {
        if ((row >= 0) && (row < HEIGHT) && (col >= 0) && (col < WIDTH)) {
            return true;

        }
        return false;

    }

    public static int countAliveNeighbors(int row, int col, int[][] world) {
        int aliveNeigbors = 0;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col -1; j <= col + 1; j++) {
                if (exists(i, j)) {
                    if (world[i][j] == ALIVE) {
                        aliveNeigbors++;
                    }

                }

            }
        }
        if (world[row][col] == ALIVE) {
            aliveNeigbors--;

        }

        return aliveNeigbors;
    }


    public static int fitness(int row, int col, int[][] grid) {
        // get neighbors
        int aliveNeigbors = countAliveNeighbors(row, col, grid);
        final int curr = grid[row][col];
        // apply the rules

        // Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
        if ((curr == ALIVE) && (aliveNeigbors < 2)) {
            return DIES;
        }
        // Any live cell with more than three live neighbours dies, as if by overpopulation.
        if ((curr == ALIVE) && (aliveNeigbors > 3)) {
            return DIES;
        }
        // Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
        if ((curr == DEAD) && aliveNeigbors == 3) {
            return LIVES;
        }

        // Any live cell with two or three live neighbours lives on to the next generation.
        if ((curr == ALIVE) && ((aliveNeigbors == 2) ||(aliveNeigbors == 3))) {
            return LIVES;
        }

        return curr;
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
