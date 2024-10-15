import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random(1000);

        for (int i = 0; i < 50; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println(randomNumber);
        }
    }
}