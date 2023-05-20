import java.util.HashMap;

public class Menu {

    private Input input = new Input();

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

    public void abrir(){

        System.out.println();
        System.out.println("--> MENU");

        items.forEach((numero, descricao) -> {
            System.out.print(numero);
            System.out.print(": ");
            System.out.println(descricao);
        });

        System.out.print("--> Escolha uma opcao: ");

    }

    public Integer selecionarOpcao(){
        
        Integer opcao = input.pedirInteger(null);

        return opcao;
    }

}
