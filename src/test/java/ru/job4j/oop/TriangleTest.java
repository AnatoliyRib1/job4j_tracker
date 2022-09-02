package ru.job4j.oop;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotExist() {

        double ab = 1.0;
        double ac = 3.0;
        double bc = 5.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }
}