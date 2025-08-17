import java.awt.Graphics;

public class Grid {
    Cell[][] cells;
    int cellSize;

    public Grid(int size, int rows, int cols) {
        this.cellSize = size;
        cells = new Cell[rows][cols];

        for(int i = 0; i < rows; i++) {
          for(int j = 0; j < cols; j++) {
            cells[i][j] = new Cell(i, j);
          }
        }
    }

    public int getRows() {
        return cells.length;
    }

    public int getCols() {
        return cells[0].length;
    }

    public int getCellSize() {
        return cellSize;
    }

    public void draw(Graphics g) {
        for(int i = 0; i < getRows(); i++) {
          for(int j = 0; j < getCols(); j++) {
            cells[i][j].draw(g, cellSize);;
          }
        }
    }
}
