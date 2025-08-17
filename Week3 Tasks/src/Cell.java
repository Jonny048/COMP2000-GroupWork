import java.awt.Graphics;

public class Cell {
    int row, col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void draw(Graphics g, int cellSize) {
        int x = col * cellSize;
        int y = row * cellSize;
        g.setColor(java.awt.Color.BLACK);
        g.drawRect(x, y, cellSize, cellSize);
    }
}
