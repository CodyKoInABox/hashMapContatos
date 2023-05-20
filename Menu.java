import java.util.HashMap;
import java.util.Scanner;

public class Menu {

    public Menu() {}
    
    public Menu(String[] descricoes) {
        for(String descricao : descricoes){
            this.adicionarItem(descricao);
        }
    }
    
    private HashMap<Integer, String> items = new HashMap<Integer, String>();

    public void adicionarItem(String descricao){
        this.items.put(this.items.size()+1, descricao);
    }

    public void removerItem(Integer numeroDoItem){
        this.items.remove(numeroDoItem);
    }

    public Integer abrirESelecionarOpcao(){

        System.out.println("Escolha uma opcao:");

        items.forEach((numero, descricao) -> {
            System.out.print(numero);
            System.out.print(": ");
            System.out.println(descricao);
        });


        Scanner scanner = new Scanner(System.in);

            Integer opcao = scanner.nextInt();
            scanner.nextLine();
            scanner.close();
        

        return opcao;

    }

}
