package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Ball ball = new Ball();
        System.out.println("Встретил зайца: ");
        hare.tryEat(ball);
        System.out.println(", встретил волка: ");
        wolf.tryEat(ball);
        System.out.println(", а при встрече с лисой: ");
        fox.tryEat(ball);
    }
}
