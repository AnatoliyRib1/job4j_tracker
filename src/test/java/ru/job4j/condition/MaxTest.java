package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax5To2To4To9Then9() {
        int first = 5;
        int second = 2;
        int third = 4;
        int fourth = 9;
        int result = Max.max(first, second, third, fourth);
        int expected = 9;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void whenMax2To7To55Then55() {
        int first = 2;
        int second = 7;
        int third = 55;
        int result = Max.max(first, second, third);
        int expected = 55;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void whenMax5To5Then5() {
        int first = 5;
        int second = 5;
        int result = Max.max(first, second);
        int expected = 5;
        assertThat(result).isEqualTo(expected);

    }
}