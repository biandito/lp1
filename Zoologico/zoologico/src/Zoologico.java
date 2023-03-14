import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    private List<Animal> animais = new ArrayList<Animal>();

    public void adicionaAnimal(Animal animal) {
        animais.add(animal);
        }
    public void listarAnimais() {
      for (Animal animal: animais){
        System.out.println(animal.getNome() + " especie=" +animal.getEspecie() + " idade="+animal .getIdade() + " alimentado="+animal .getAlimentado());
      }
        
    }
    public void alimentarAnimais() {
    for (Animal animal: animais) {
    animal.alimentar();
    }
    }
}
