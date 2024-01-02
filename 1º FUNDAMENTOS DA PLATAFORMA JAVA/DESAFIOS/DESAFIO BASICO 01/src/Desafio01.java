import java.util.Scanner;

/**
 * @author Carlos Alberto
 * @since  02/01/2024
 * 
 * Desafio
 * Você receberá dois valores inteiros. Faça a leitura e em seguida calcule 
 * o produto entre estes dois valores. Atribua esta operação à variável PROD,
 * mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).
 * 
 * Entrada
 * A entrada contém 2 valores inteiros.
 * 
 * Saída
 * Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente 
 * um espaço em branco antes e depois da igualdade.
 * 
 * @param A corresponde a uma variavel fornecida peleo usuario
 * @param B corresponde a outra variavel fornecida pelo usuario
 * @param PROD corresponde ao resultado entre a multiplicação das variaveis
 * A e B
 */
public class Desafio01 {

    public static void main(String[] args){

        // Inicialização da variavel para receber valores do usuário
        Scanner scanner = new Scanner(System.in);

        // Tipagem das varivaies
        int A, B, PROD;

        // Recebimento das variaveis pelo Usuario
        A = scanner.nextInt();
        B = scanner.nextInt();

        /**
         * @param A 
         * @param B corresponde 
         */
        PROD = A * B;

        System.out.println("PROD = " + PROD);

    }
    
}
