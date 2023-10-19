public class TesteEncapsulamento {
    public static void main(String[] args) {
        Personagem grilo = new Personagem("Falante");
        grilo.exibirAtributos();

        Personagem saci = new Personagem("Perere", 50, 20, 45);
        saci.exibirAtributos();

        Personagem vampiro = new Personagem("Dracula", 0, 10, 10);
        vampiro.morrer();
    }
}
