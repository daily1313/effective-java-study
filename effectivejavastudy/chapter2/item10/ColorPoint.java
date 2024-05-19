package effectivejavastudy.chapter2.item10;

import java.awt.Color;
import java.util.Objects;

public class ColorPoint {

    private final Color color;
    private final Point point;

    public ColorPoint(int x, int y, Color color) {
        this.point = new Point(x, y);
        this.color = Objects.requireNonNull(color);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }

        if(!(o instanceof ColorPoint)) {
            return false;
        }

        ColorPoint cp = (ColorPoint) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }
}
