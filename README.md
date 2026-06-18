# Conway's Game of Life (Java)

A simple console-based implementation of Conway's Game of Life written in Java.

This project was built to practice fundamental programming concepts such as arrays, loops, conditionals, methods, and algorithm design before introducing Object-Oriented Programming (OOP).

## About

Conway's Game of Life is a cellular automaton created by mathematician John Conway. The simulation consists of a grid of cells that evolve over time according to a set of rules based on the state of neighboring cells.

This implementation uses:

* Two-dimensional arrays to represent the world
* Random population generation
* Console rendering
* Iterative generation updates
* Conway's standard rules for cell survival and reproduction

## Features

* Random world generation
* Configurable grid size
* Real-time console rendering
* Neighbor counting
* Generation-by-generation evolution
* ANSI terminal screen clearing for animation

## Rules

For each generation:

1. Any live cell with fewer than two live neighbors dies.
2. Any live cell with two or three live neighbors survives.
3. Any live cell with more than three live neighbors dies.
4. Any dead cell with exactly three live neighbors becomes alive.

## Project Structure

The application is implemented in a single Java class:

| Method                  | Purpose                                 |
| ----------------------- | --------------------------------------- |
| `main()`                | Starts the simulation                   |
| `randomSeed()`          | Generates the initial random population |
| `run()`                 | Runs the simulation loop                |
| `render()`              | Displays the current world state        |
| `epoch()`               | Computes the next generation            |
| `fitness()`             | Applies Conway's rules to a cell        |
| `countAliveNeighbors()` | Counts living neighbors                 |
| `exists()`              | Checks grid boundaries                  |
| `clearScreen()`         | Clears the terminal screen              |

## Example Output

Alive cells are represented by:

```text
*
```

Dead cells are represented by:

```text
.
```

Example:

```text
. . * . . . .
. * * * . . .
. . * . . . .
```

## Configuration

The grid dimensions are controlled by:

```java
final static int WIDTH = 100;
final static int HEIGHT = 20;
```

Simulation speed is controlled by:

```java
Thread.sleep(800);
```

The value is measured in milliseconds.

## How to Run

Compile:

```bash
javac GameOfLife.java
```

Run:

```bash
java GameOfLife
```

## Learning Goals

This project focuses on:

* Java fundamentals
* Arrays
* Nested loops
* Algorithm implementation
* State transitions
* Simulation programming
* Problem solving

## Future Improvements

Planned improvements include:

* Refactor to Object-Oriented Programming
* Separate simulation logic from rendering
* User-defined seed patterns
* Pause and resume functionality
* Adjustable simulation speed
* Toroidal (wrapping) world support
* GUI version using Java Swing or JavaFX
* Pattern library (Glider, Pulsar, Gosper Glider Gun)
* Unit testing

## Technologies

* Java
* Terminal/Console Output
* Java Standard Library
