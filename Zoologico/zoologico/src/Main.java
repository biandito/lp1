public class Main {

public static void main(String[] args) {
Mamifero macaco = new Mamifero("macaco", 2, "babuino",10);


Zoologico zoologico = new Zoologico();

zoologico.adicionaAnimal(macaco);
zoologico.listarAnimais();
zoologico.alimentarAnimais();
zoologico.listarAnimais();



} 
}

