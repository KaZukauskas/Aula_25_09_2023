public class Jogo1 {
    public static void main(String[] args){
        Personagem cacador = new Personagem("John", 10, 0, 0);
        cacador.cacar();

        Personagem lenhador = new Personagem("Robin");
        lenhador.cacar();

        cacador.comer();
        lenhador.dormir();
    }
}