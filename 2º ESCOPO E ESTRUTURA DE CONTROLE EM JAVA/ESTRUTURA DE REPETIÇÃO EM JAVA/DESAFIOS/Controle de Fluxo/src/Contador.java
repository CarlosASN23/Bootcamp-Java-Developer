/**
 * @author Carlos Alberto SN
 * @since 07/01/2024
 * @param numero01
 * @param numero02
 * @param N
 * O Sistema receberá dois numeros inteiros numero01 e numero02
 * através do terminal pelo usuário e com estes dois numeros 
 * deverá obter a quantidade de interações = N (for) e realizar a impressão
 * no console (System.out.print) dos números incrementados
 * @return Exibição da mensagem "Imprimindo o numero i"
 */
public class Contador {
    public static void main(String[] args) {
        
        //Scanner scanner = new Scanner(System.in);
        //int numero01 = scanner.nextInt();
        //int numero02 = scanner.nextInt();
        int numero01 = Integer.valueOf(args[0]);
        int numero02 = Integer.valueOf(args[1]);

        try{
            contar(numero01, numero02);
        }
        catch (Exception e){
            ParametrosInvalidosException();
        }
     
    }

    // Criação do método contador que verificará se a entrada dos numeros
    // satisfazem as condições para iniciar a interação
    public static void contar(int numero01, int numero02){

        if (numero02 > numero01){
            int N = numero02 - numero01;
            for(int i = 0; i < N; i++){
                    System.out.println("Imprimindo o número " + (i+1));
                }
        }
        // Chamamento do método de exceção
        else{
            ParametrosInvalidosException();
        }
    }

    // Criação do Método de exceção para o caso das condições não serem satisfeitas no método contar()
    private static void ParametrosInvalidosException() {
        System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }
}
