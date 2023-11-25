package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax8To15Then15() {
        int result = Max.max(8, 15);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To7To9Then9() {
        int result = Max.max(2, 7, 9);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To1To2To4Then5() {
        int result = Max.max(5, 1, 2, 4);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}
