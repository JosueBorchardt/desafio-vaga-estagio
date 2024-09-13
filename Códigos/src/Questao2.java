import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma String: ");
        String texto = scan.nextLine();
        
        System.out.println("Essa string possui " + contar_caracter(texto) + " letra a");

        scan.close();
    }

    public static int contar_caracter(String texto){
        int quantidade_de_a = 0;
        String texto_minusculo = texto.toLowerCase();

        for(int i = 0; i < texto.length(); i++){
            if(texto_minusculo.charAt(i) == 'a'){
                quantidade_de_a++;
            }
        }

        return quantidade_de_a;
    }
}
