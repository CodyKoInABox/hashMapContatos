public class Main{
    
    public static void main(String args[]){
        
        //GerenciadorDeContatos gerenciador = new GerenciadorDeContatos();

        //gerenciador.adicionarContato("Joao", "123456789");
        //gerenciador.adicionarContato("Maria", "987654321");

        //gerenciador.removerContato("Joao");

        //gerenciador.buscarContato("Joao");

        //gerenciador.listarContatos();


        
        String[] itemsMenu = {"Adicionar Contato", "Remover Contato", "Buscar Contato", "Listar Contatos", "Sair"};

        Menu menu = new Menu(itemsMenu);
        
        switch(menu.abrirESelecionarOpcao()){
            case 1:
            break;
            
            case 2:
            break;

            case 3:
            break;

            case 4:
            break;

            default:
                return;
        }

    }
}