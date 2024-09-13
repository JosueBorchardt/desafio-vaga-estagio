import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scan.nextInt();
        
        if(verificar_fibonacci(numero)){
            System.out.println(numero + " pertence a sequência de Fibonacci");
        }else{
            System.out.println(numero + " não pertence a sequência de Fibonacci");
        }
        
        scan.close();
    }

    public static boolean verificar_fibonacci(int numero){
        if(numero == 0 || numero == 1){
            return true;
        }
        
        int x = 0;
        int y = 1;
        int proximo_numero = x + y;

        while(proximo_numero <= numero){
            if(proximo_numero == numero){
                return true;
            }

            x = y;
            y = proximo_numero;
            proximo_numero = x + y;

        }

        return false;
    }
}
