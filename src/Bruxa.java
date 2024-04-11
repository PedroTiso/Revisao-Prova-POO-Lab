import java.util.Arrays;

public class Bruxa extends Monstro {

    private Feitico feiticos[] = new Feitico[10] ;

    // Este for do construtor Bruxa serve para varrer a lista a lista de feitiços e
    // Adiciona o nome como null e o poder como 0
    public Bruxa(int idade, int vida, int energia){
        super(idade, vida, energia);
        for(int i = 0; i < feiticos.length; i++){
            feiticos[i] = new Feitico();
        }
    }

    public boolean aprenderFeitico(String nome, int poder){
        // Essa funcao percorre os itens da lista de feiticos até
        // encontrar a primeira posição nula. Ao encontrar
        // preenchemos esse feitico com os argumentos passados pra
        // funcao

        for(int i = 0; i < feiticos.length; i++){
            if(feiticos[i].getNome() == null){
                feiticos[i].setNome(nome);
                feiticos[i].setPoder(poder);
                System.out.println("Feitiço aprendido com sucesso");
                return true;
            }
        }
            System.out.println("Não foi possível aprender novos feitiços");
            return false;

    }

    public void listarFeiticos(){
        for(int i = 0;  i < feiticos.length; i++){
            if(feiticos[i].getNome() != null){
                System.out.println(feiticos[i].getNome());
                System.out.println(feiticos[i].getPoder());
            }
        }
    }

    public void esquecerFeitico(int posicao){
        for(int i = 0;  i < feiticos.length; i++){
            // Se a posição atual for igual a posicao desejada
            // apague o feitico nessa posicao
            if(i == posicao){
                feiticos[i].setNome(null);
                feiticos[i].setPoder(0);
                break;
            }
        }
    }

    public void lancarFeitico(Monstro monstroAlvo, int posicao){

        int novaVida;
        if(monstroAlvo.getVida() > 0){
            novaVida = monstroAlvo.getVida() - this.feiticos[posicao].getPoder();
            monstroAlvo.setVida(novaVida);
            int novaEnergiaBruxa = this.getEnergia() - 1;
            this.setEnergia(novaEnergiaBruxa);
            System.out.println("Bruxa lançou o feitiço no monstro Alvo");
        } else{
            System.out.println("O monstro alvo já está mais morto");
        }

        // Depois do dano recebido, esta é a nova vida do monstro alvo
    }

    @Override
    public String toString() {
        return "Infos da Bruxa: " + "\n" +
                "Idade" + this.getIdade() + "\n" +
                "Vida" + this.getVida() + "\n" +
                "Energia" + this.getEnergia() + "\n";
    }

    // Rodando o for do construtor da bruxa, ele preenche o nome como nulll e poder como 0
    // E no aprender feitiços, o for faz com que
    // posicao 0
    // Nome: null ->
    // poder: 0 ->

    // posicao 0
    // Nome: null ->
    // poder: 0 ->

}
