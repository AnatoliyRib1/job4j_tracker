package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00To20Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when20To22Then2() {
        double expected = 2;
        Point a = new Point(2, 0);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when01To56Then7Dot07() {
        double expected = 7.07;
        Point a = new Point(0, 1);
        Point b = new Point(5, 6);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when011To566Then8Dot66() {
        double expected = 8.66;
        Point a = new Point(0, 1, 1);
        Point b = new Point(5, 6, 6);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when555To666Then1Dot73() {
        double expected = 1.73;
        Point a = new Point(5, 5, 5);
        Point b = new Point(6, 6, 6);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);

    }
}