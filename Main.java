public class Main{
    
    public static void main(String args[]){
        
        GerenciadorDeContatos gerenciador = new GerenciadorDeContatos();

        gerenciador.adicionarContato("Joao", "123456789");
        gerenciador.adicionarContato("Maria", "987654321");

        gerenciador.removerContato("Joao");

        gerenciador.buscarContato("Maria");

        gerenciador.listarContatos();

    }
}