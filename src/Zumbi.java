public class Zumbi extends Monstro {

    private int numeroDeCerebros;

    public Zumbi(int idade, int vida, int energia, int numeroDeCerebros) {
        super(idade, vida, energia);
        this.numeroDeCerebros = numeroDeCerebros;
    }

    public void atacarComMordida(Monstro monstroAlvo){
        int novaVida;
        if(monstroAlvo.getVida() > 0){
            novaVida = monstroAlvo.getVida() - 5;
            monstroAlvo.setVida(novaVida);
            numeroDeCerebros = numeroDeCerebros + 2;
            System.out.println("O monstro Zumbi atacou com mordida");
        } else{
            System.out.println("Sem cerebros pra devorar");
        }
    }
}
