import java.util.Random;

public class Jogo3 {
    public static void main(String[] args) throws InterruptedException{
        Personagem cacador = new Personagem("John");

        Random random = new Random();
        while (true) {
            int sorteio = random.nextInt(3);
            switch (sorteio){
                case 0: cacador.cacar();
                    break;

                case 1: cacador.comer();
                    break;

                default: cacador.dormir();
            }
            
            System.out.println("===");
            Thread.sleep(1500);
        }
    }
}