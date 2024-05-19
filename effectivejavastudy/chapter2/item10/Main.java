package effectivejavastudy.chapter2.item10;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CaseInsensitiveString s1 = new CaseInsensitiveString("String");

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(s1);

        String s2 = "string";

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
        System.out.println(list.contains(s2));

        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals(p3));
    }
}
