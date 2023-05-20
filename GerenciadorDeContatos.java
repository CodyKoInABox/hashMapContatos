import java.util.HashMap;
import java.util.Scanner;

public class GerenciadorDeContatos {

    final private static Scanner scanner = new Scanner(System.in);
    
    private HashMap<String, String> contatos = new HashMap<String, String>();

    public void adicionarContato(String nome, String telefone){
        this.contatos.put(nome, telefone);

        System.out.println("Contato adicionado: " + nome + " - " + telefone);
        System.out.println();
    }

    public void adicionarContatoScanner(){
        String nome = "";
        String telefone = "";
        Scanner scanner = new Scanner(System.in);
        
        //System.out.println();
        System.out.println("Adicionar contato:");
        System.out.println("Insira o nome: ");
        //System.out.println();

        if(scanner.hasNextLine()){
            nome = scanner.nextLine();
        }
        
        //System.out.println();
        System.out.println("Insira o telefone: ");
        
        
        if(scanner.hasNextLine()){
            telefone = scanner.nextLine();
        }

        if(nome != "" && telefone != ""){
            this.adicionarContato(nome, telefone);
        }
        
    }

    public void removerContato(String nome){
        this.contatos.remove(nome);

        System.out.println("Contato removido: " + nome);
        System.out.println();
    }

    public void removerContatoScanner(){
        System.out.println();
        System.out.println("Remover contato:");
        System.out.println();
        System.out.print("Insira o nome: ");
        String nome = GerenciadorDeContatos.scanner.next();
        this.removerContato(nome);
    }

    public void buscarContato(String nome){
        String telefone = this.contatos.get(nome);

        if(telefone == null){
            System.out.println(nome + " nao possui um telefone salvo.");
        }else{
            System.out.println(telefone);
        }
    }

    public void buscarContatoScanner(){
        System.out.println();
        System.out.println("Buscar contato:");
        System.out.println();
        System.out.print("Insira o nome: ");
        String nome = GerenciadorDeContatos.scanner.next();
        this.buscarContato(nome);
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
