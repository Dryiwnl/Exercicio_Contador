import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {
    public static void main(String[] args) throws Exception {
            int n1, n2;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o primeiro numero: \n");
            n1 = scanner.nextInt();
            System.out.println("Informe o segundo numero: \n");
            n2 = scanner.nextInt(); 

            try {
                contador(n1, n2);
            } catch (ParametrosInvalidosException e) {
                System.out.println("Erro: "+e.getMessage());
            }
            
    }
     static void contador(int n1, int n2) throws ParametrosInvalidosException{
        if (n1>n2){
            throw  new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        else{
            int diferenca = n2-n1;
            for(int i = 1;i<=diferenca;i++){
                System.out.println("Imprimindo o número "+ i);
            }
        }
    }
}
