public class Main {
    public static void main(String[] args)
    {
        Bruxa bruxa = new Bruxa(340, 200, 150);
        Monstro monstroAlvo = new Monstro(50, 100, 80);
        bruxa.aprenderFeitico("Relâmpago", 340);
        bruxa.aprenderFeitico("Bola de Fogo", 210);
        bruxa.listarFeiticos();
        bruxa.esquecerFeitico(0);
        System.out.println();
        bruxa.listarFeiticos();
        bruxa.lancarFeitico(monstroAlvo, 1);
        // Mostrar a vida do monstroAlvo e mostrar as informações da bruxa

        Zumbi zumbi = new Zumbi(500,300,650,0);
        zumbi.atacarComMordida(monstroAlvo);
        // Mostrar as infos do MonstroAlvo e as  infos do Zumbbi

        Vampiro vampiro = new Vampiro(1000, 2000, 3790, 100, false);
        vampiro.transformar();
        vampiro.atacarComMordida(monstroAlvo);
        vampiro.recuperarVida();
        // Mostrar as infos do vampiro e as infos do Monstro alvo após o ataque



    }
}