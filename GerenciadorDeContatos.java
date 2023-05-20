import java.util.HashMap;

public class GerenciadorDeContatos {

    private HashMap<String, String> contatos = new HashMap<String, String>();

    public void adicionarContato(String nome, String telefone){
        this.contatos.put(nome, telefone);

        System.out.println();
        System.out.println("Contato adicionado: " + nome + " - " + telefone);
        System.out.println();
    }

    public void removerContato(String nome){
        this.contatos.remove(nome);

        System.out.println();
        System.out.println("Contato removido: " + nome);
        System.out.println();
    }

    public void buscarContato(String nome){
        String telefone = this.contatos.get(nome);

        System.out.println();
        if(telefone == null){
            System.out.println(nome + " nao possui um telefone salvo.");
        }else{
            System.out.println(telefone);
        }
    }

    public void listarContatos(){

        System.out.println();
        System.out.println("Contatos:");

        contatos.forEach((key, value) -> {
            System.out.print(key);
            System.out.print(" ");
            System.out.println(value);
        });

    }
    
}
