/**
 * @author Carlos Alberto
 * @since 02/01/2024
 * O programa consiste em simular um sistema bancario com os parâmetros:
 * Número (numero da conta), agencia (agência da conta), nome (cliente), saldo (saldo)
 * Ao receber esses dados via Terminal pelo usuario, iremos imprimir uma breve extrato 
 * com as informações da conta ao cliente.
 * 
 * @param numero  Variavel do tipo inteiro que corresponde ao numero da conta
 *                que será fornecido pelo usuario via terminal
 * 
 * @param agencia Variavel do tipo String que corresponde ao numero da agência
 *                da conta e será fornecido pelo usuario via terminal
 * 
 * @param nome Variavel do tipo String que corresponde ao nome do usuario
 * 
 * @param saldo Variavel do tipo double que corresponde ao valor a ser alocado na conta
 *              pelo usuario via terminal
 * 
 * @return  Irá retornar a seguinte mensagem:
 * 
 *          "Olá [Nome Cliente], obrigado por criar uma conta em  nosso banco, 
 *          sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está 
 *          disponível para saque"
 */
public class ContaTerminal {
    
    public static void main(String[] args){
        
        // Inicialização das variaveis com passagem dos argumentos
        int numero = Integer.valueOf(args [0]);
        String agencia = args [1];
        String nomeCliente = args [2];
        double saldo = Double.valueOf(args [3]);

        // Saida da mensagem ao usuário
        System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em  nosso banco, sua agência é " + agencia+", conta "+ numero + " e seu saldo de R$"+saldo+ " já está disponível para saque");
        
    }
}
