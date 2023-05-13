import java.util.HashMap;

public class GerenciadorDeContatos {
    
    private HashMap<String, String> contatos = new HashMap<String, String>();

    public void adicionarContato(String nome, String telefone){
        this.contatos.put(nome, telefone);
        
        System.out.println("Contato adicionado: " + nome + " - " + telefone);
    }

    public void removerContato(String nome){
        this.contatos.remove(nome);

        System.out.println("Contato removido: " + nome);
    }

    public void buscarContato(String nome){
        System.out.println(this.contatos.get(nome));
    }

    public void listarContatos(){

        System.out.println("Contatos:");

        contatos.forEach((key, value) -> {
            System.out.print(key);
            System.out.print(" ");
            System.out.println(value);
        });

    }
    
}
