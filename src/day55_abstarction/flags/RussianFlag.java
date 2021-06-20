package day55_abstarction.flags;

import java.awt.*;

public class RussianFlag extends Flag {

    @Override
    public void draw() {

        Grid grid = new Grid();

        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i, 0, Color.RED);
        }

        for(int col=0;col<grid.getWd();col++) {
            for (int row = 0; row < grid.getHt(); row++) {
                if (row < grid.getHt() / 3) {
                    grid.setColor(row, col, Color.WHITE);
                } else if (row < grid.getHt() / 3 * 2) {
                    grid.setColor(row, col, Color.BLUE);
                } else {
                    grid.setColor(row, col, Color.RED);
                }
            }
        }

    }
}
