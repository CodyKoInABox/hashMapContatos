import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Main{
    
    public static void main(String args[]){

        GerenciadorDeContatos gerenciador;

        
        try{
            FileInputStream fileIn = new FileInputStream("gerenciadorSalvo.ser");

            ObjectInputStream in = new ObjectInputStream(fileIn);
    
            gerenciador = (GerenciadorDeContatos) in.readObject();
            
            in.close();
            fileIn.close();
        }catch (IOException e) {
            gerenciador = new GerenciadorDeContatos();
        } catch (ClassNotFoundException e) {
            gerenciador = new GerenciadorDeContatos();
        }


        Input input = new Input();
        
        //GerenciadorDeContatos gerenciador = new GerenciadorDeContatos();


        String[] itemsMenu = {"Adicionar Contato", "Remover Contato", "Buscar Contato", "Listar Contatos", "Sair"};

        Menu menu = new Menu(itemsMenu);
        

        while(true){

        menu.abrir();

        switch(menu.selecionarOpcao()){
            case 1:
                System.out.println();
                System.out.println("ADICIONAR CONTATO:");
                System.out.println();
                String nome1 = input.pedirStringMesmaLinha("Insira o nome: ");
                String telefone1 = input.pedirStringMesmaLinha("Insira o telefone: ");
                gerenciador.adicionarContato(nome1, telefone1);
            break;

            case 2:
                System.out.println();
                System.out.println("REMOVER CONTATO:");
                System.out.println();
                String nome2 = input.pedirStringMesmaLinha("Insira o nome: ");
                gerenciador.removerContato(nome2);

            break;

            case 3:
                System.out.println();
                System.out.println("BUSCAR CONTATO:");
                System.out.println();
                String nome3 = input.pedirStringMesmaLinha("Insira o nome: ");
                gerenciador.buscarContato(nome3);
            break;

            case 4:
                System.out.println();
                System.out.println("LISTAR CONTATOS:");
                System.out.println();
                gerenciador.listarContatos();
            break;

            default:
                System.out.println();
                System.out.println("Salvando e Saindo...");
                System.out.println();

                try {
                    gerenciador.serialize("gerenciadorSalvo.ser", gerenciador);
                } catch (IOException e) {
                    // Auto-generated catch block
                    e.printStackTrace();
                }
            return;

        }

    }


    }
}