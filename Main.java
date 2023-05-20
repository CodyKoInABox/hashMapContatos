public class Main{
    
    public static void main(String args[]){


        
        GerenciadorDeContatos gerenciador = new GerenciadorDeContatos();


        String[] itemsMenu = {"Adicionar Contato", "Remover Contato", "Buscar Contato", "Listar Contatos", "Sair"};

        Menu menu = new Menu(itemsMenu);
        
        switch(menu.abrirESelecionarOpcao()){
            case 1:
                gerenciador.adicionarContatoScanner();
            break;
            
            case 2:
                gerenciador.removerContatoScanner();
            break;

            case 3:
                gerenciador.buscarContatoScanner();
            break;

            case 4:
                gerenciador.listarContatos();
            break;

            default:
                return;
        }

    }
}