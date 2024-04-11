public class Vampiro extends Monstro {
    private int medidorDeSangue;
    private boolean formaDeMorcego;

    public Vampiro(int idade, int vida, int energia, int medidorDeSangue, boolean formaDeMorcego){
        super(idade, vida, energia);
        this.medidorDeSangue = medidorDeSangue;
        this.formaDeMorcego = formaDeMorcego;

    }

    public void transformar(){
        this.formaDeMorcego = !formaDeMorcego;
    }

    public void recuperarVida(){
        int novaVida;
        novaVida = this.getVida() + this.medidorDeSangue;
        // Usando o atributo medidor de sangue para recuperar a vida
        // Esta em 0 por que o atributo foi usado
        medidorDeSangue = 0;
    }

    public void atacarComMordida(Monstro monstroAlvo){
        if(monstroAlvo.getVida() > 0){
            int novaVida = monstroAlvo.getVida() - 10;
            monstroAlvo.setVida(novaVida);
            medidorDeSangue = medidorDeSangue + 1;
            System.out.println("Vampiro atacou com mordida");
        } else{
            System.out.println("Sem sangue para sugar");
        }

    }
}
