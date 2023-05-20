import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    
    public String pedirString(String mensagem){

        if(mensagem != null){
            System.out.println(mensagem);
        }
        
        String input = this.scanner.nextLine();

        return input;
    }

    public String pedirStringMesmaLinha(String mensagem){

        if(mensagem != null){
            System.out.print(mensagem);
        }
        
        String input = this.scanner.next();
        this.scanner.nextLine();

        return input;
    }

    public Integer pedirInteger(String mensagem){

        if(mensagem != null){
            System.out.println(mensagem);
        }
        
        Integer input = this.scanner.nextInt();
        this.scanner.nextLine();

        return input;
    }


    public void closeScanner(){
        this.scanner.close();
    }
}
