package Colecciones;

public class Main {
    public static void main(String[] args) {
        final int NUM_BALLS = 75;
        final int NUM_BALLS_TO_REMOVE = 18;
        ArraySet<BingoBall> bingo = new ArraySet<>();
        BingoBall ball;

        for (int num = 1; num <= NUM_BALLS; num++) {
            ball = new BingoBall(num);
            bingo.add(ball);
        } 

        System.out.println(bingo);
        System.out.println("Size: " + bingo.size());

        for (int num = 1; num <= NUM_BALLS_TO_REMOVE; num++) {
            ball = bingo.removeRandom();
            System.out.println(ball);
        }
    }
}
