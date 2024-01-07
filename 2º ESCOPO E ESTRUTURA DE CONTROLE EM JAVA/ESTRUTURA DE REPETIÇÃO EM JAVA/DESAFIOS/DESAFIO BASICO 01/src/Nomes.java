import java.util.Scanner;

/**
 * 
 * @author Carlos Alberto S.N
 * @since 07/01/2024
Desafio

Faça um programa com as características abaixo:

    @param nome Leia 10 nomes, sem espaço em branco;
    @return Imprima o terceiro nome da lista;
    @return Imprima o sétimo nome da lista;
    @return Imprima o nono nome da lista.

Entrada:
A entrada consiste vários arquivos de teste, cada um com dez linhas e 
em cada linha tem um nome de no até 30 caracteres e sem espaço em branco.
Conforme mostrado no exemplo de entrada a seguir.

Saída:
Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado
no Desafio, gere três linhas conforme os procedimentos 2, 3 e 4. Use o exemplo
abaixo para clarear o que está sendo pedido.
 */

public class Nomes {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String [] nome = new String[10];

        for(int i=0; i<10; i++){
            nome[i] = scanner.nextLine();
           
            while (i == 2 || i==6 || i==8){
                System.out.println(nome[i]);
                break;
            }
        }

    }
}
