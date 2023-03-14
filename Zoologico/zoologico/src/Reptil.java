public class Reptil extends Animal {
    double temperaturaCorporal;

    public Reptil (String nome, int idade, String especie, double temperaturaCorporal){
        super(nome,idade,especie);
        this.temperaturaCorporal = temperaturaCorporal;

    }
    
    public void emitirSom(){
        System.out.println("Shhh");
    }
   
    public void alimentar() {
    this.setAlimentado(true);
    }
    
}
