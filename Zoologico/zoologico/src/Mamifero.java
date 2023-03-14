public class Mamifero extends Animal {
    int tempoGestacao;

    public Mamifero (String nome, int idade, String especie, int tempoGestacao){
        super(nome,idade,especie);
        this.tempoGestacao = tempoGestacao;
    }
   
    public void emitirSom() {
    System.out.println("Ca");
    }
    
    public void alimentar() {
        this.setAlimentado(true);
    }
    

}