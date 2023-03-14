public class Ave extends Animal {
    String tipoBico;

    public Ave (String nome, int idade, String especie, String tipoBico){
        super(nome,idade,especie);
        this.tipoBico = tipoBico;
}
   
   public void emitirSom() {
    System.out.println("Bentevi");
   
   }

public void alimentar() {
    this.setAlimentado(true);

} 
}