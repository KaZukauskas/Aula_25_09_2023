import java.util.Random;

public class Megasena {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 1; i <= 6; i ++){
            System.out.println(random.nextInt(60) + 1);
        }
    }
}
