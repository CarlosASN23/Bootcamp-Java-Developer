import java.util.Scanner;

/**
 * 
 * @author Carlos Alberto
 * @since  02/01/2024
 * 
 * Desafio:
 *  Leia dois valores inteiros identificados como variáveis A e B. 
 *  Calcule a soma entre elas e chame essa variável de SOMA.
 *  A seguir escreva o valor desta variável.
 * 
 * Entrada:
 *  O arquivo de entrada contém 2 valores inteiros.
 * 
 * Saída:
 *  Imprima a variável SOMA com todas as letras maiúsculas, 
 *  inserindo um espaço em branco antes e depois do símbolo 
 *  de igualdade, seguido pelo valor correspondente à soma de A e B.
 * @param A corresponde ao valor da variavel A fornecida pelo usuario
 * @param B corresponde ao valor da variavel B fornecida pelo usuario
 * @param SOMA corresponde ao resultado da operação A + B
 */

public class Desafio02 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int A, B, SOMA;

        A = scanner.nextInt();
        B = scanner.nextInt();

        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);
    }
}
