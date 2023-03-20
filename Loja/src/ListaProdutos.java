import java.util.ArrayList;
import java.util.Scanner;

public class ListaProdutos {
    private static ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
    
    public static void main(String[] args) {
        adicionarProdutos(); 
        exibirListaProdutos(); 
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEscolha produto: ");
        System.out.print("Preço a ser pago: ");
        double valorPago = scanner.nextDouble();
        try {
            venderProduto(nome, preco); 
            System.out.println("\nSucesso");
            exibirListaProdutos(); 
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage()); 
        }
    }
    
    private static void adicionarProdutos() {
        Produto produto1 = new Produto("Skate", 200.00);
        Produto produto2 = new Produto("Bicicleta", 600.00);
        Produto produto3 = new Produto("Patins", 150.00);
        Produto produto4 = new Produto("Capacete", 50.00);
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);
    }
    
    private static void exibirListaProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("\nNão há produtos na lista.");
        } else {
            System.out.println("\nLista de Produtos:");
            for (Produto produto : listaProdutos) {
                System.out.println(produto.getNome() + " - R$" + produto.getPreco());
            }
        }
    }
    
    private static void venderProduto(String nomeProduto, double valorPago) throws Exception {
        Produto produtoVendido = null;
        for (Produto produto : listaProdutos) {
            if (produto.getNome().equals(nomeProduto)) {
                if (valorPago < produto.getPreco()) {
                    throw new Exception("Erro");
                } else {
                    produtoVendido = produto;
                    break;
                }
            }
        }
        if (produtoVendido == null) {
            throw new Exception("Erro");
        } else {
            listaProdutos.remove(produtoVendido);
        }
    }
}
