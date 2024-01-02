import java.util.Scanner;

/**
 * 
 * @author Carlos Alberto
 * @since  02/01/2024
 * @param A referente ao valor da variavel A do tipo float fornecida pelo Usuario
 * @param B referente ao valor da variavel B do tipo float fornecida pelo Usuario
 * @param MEDIA corresponde ao resultado da média entre os valores A e B do tipo double
 * 
 * Desafio:
 *  Leia 2 valores de ponto flutuante de dupla precisão A e B, 
 *  que correspondem a 2 notas de um aluno. A seguir, calcule 
 *  a média do aluno, sabendo que a nota A tem peso 3.5 e a 
 *  nota B tem peso 7.5 (A soma dos pesos portanto é 11). 
 *  Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
 * 
 * Entrada:
 *  O arquivo de entrada contém 2 valores com uma casa decimal cada um.
 * 
 * Saída
 *  Calcule e imprima a variável MEDIA conforme exemplo abaixo, 
 *  com 5 dígitos após o ponto decimal e com um espaço em branco 
 *  antes e depois da igualdade. Utilize variáveis de dupla precisão (double)
 *  e como todos os problemas, não esqueça de imprimir o fim de linha 
 *  após o resultado, caso contrário, você receberá "Presentation Error".
 */
public class Desafio03 {
    
    public static void main(String[] args){

        // Inicialização da função scanner para receber valores do usuario
        Scanner scanner = new Scanner(System.in);

        // Inicialização das varivaies
        float A, B;
        double MEDIA;

        // Recebimentos das variaveis A e B pelo Usuario
        A = scanner.nextFloat();
        B = scanner.nextFloat();

        // Calculo da variavel Média
        MEDIA = ((A*3.5)+(B * 7.5))/11;

        // Impressão dos resultados
        System.out.printf("MEDIA = %.5f", MEDIA);
        System.out.println();


        

    }
}
