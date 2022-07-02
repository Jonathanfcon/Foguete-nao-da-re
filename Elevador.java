public class Elevador {

    // caracteristica
    public int capacidade_maxima;
    public int pessoas;
    public int andar_atual;

    // Acao para adicionar uma pessoa ao elevador
    public void entrar() {
        if (this.pessoas < this.capacidade_maxima) {
        this.pessoas = this.pessoas + 1;
        System.out.print("Uma pessoa entrou no elevador!");
        }
        else {
        System.out.print("Sinto muito, o elevador esta cheio.");
        }
    }

    // Acao para retirar uma pessoa do elevador
    public void sair(){
        if (this.pessoas > 0) {
            this.pessoas = this.pessoas - 1;
            System.out.print("Uma pessoa saiu do elevador!");
        }
        else {
        System.out.print("O elevador ja esta vazio.");
        }
    }

    // Acao para o elevador subir um andar
    public void subir(){
        if (this.andar_atual < 5) {
            this.andar_atual = this.andar_atual + 1;
            System.out.print("O elevador subiu para o " + this.andar_atual + " andar!");
        }
        else if (this.andar_atual == -1) {
            this.andar_atual =  this.andar_atual + 1;
            System.out.print("O elevador subiu para o terreo!");
        }
        else if (this.andar_atual == 5) {
            System.out.print("O elevador atingiu o ultimo andar, nao ha como subir mais.");
        }
    }

    // Acao para o elevador descer um andar
    public void descer(){
        if (this.andar_atual > 1) {
            this.andar_atual = this.andar_atual - 1;
            System.out.print("O elevador desceu para o " + this.andar_atual + " andar!");
        }
        else if (this.andar_atual == 1) {
            this.andar_atual =  this.andar_atual - 1;
            System.out.print("O elevador desceu para o terreo!");
        }
        else if (this.andar_atual == 0) {
            this.andar_atual =  this.andar_atual - 1;
            System.out.print("O elevador desceu para o subsolo!");
        }
        else if (this.andar_atual == -1) {
            System.out.print("O elevador atingiu o subsolo, nao ha como descer mais.");
        }
    }

    public static void main( String[] args ) {
        
        Elevador Elevador_Entrada = new Elevador();
        public int capacidade_maxima = 10;
        public int pessoas = 0;
        public int andar_atual = 0;

        Elevador Elevador_Atrio = new Elevador();
        public int capacidade_maxima = 10;
        public int pessoas = 0;
        public int andar_atual = 0;

        Elevador Elevador_Biblioteca = new Elevador();
        public int capacidade_maxima = 10;
        public int pessoas = 0;
        public int andar_atual = 0;

    }

}