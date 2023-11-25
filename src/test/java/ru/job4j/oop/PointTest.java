package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PointTest {
    @Test
    public void distance6dot325() {
        Point a = new Point(0, 8);
        Point b = new Point(2, 2);
        double res = a.distance(b);
        double expected = 6.325;
        assertThat(res).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void distance1dot414() {
        Point a = new Point(5, 1);
        Point b = new Point(4, 2);
        double res = a.distance(b);
        double expected = 1.414;
        assertThat(res).isEqualTo(expected, withPrecision(0.01));
    }
}
