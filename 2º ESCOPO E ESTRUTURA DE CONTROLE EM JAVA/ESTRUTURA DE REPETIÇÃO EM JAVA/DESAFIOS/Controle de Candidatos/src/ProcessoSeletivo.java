import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 * @author Carlos Alberto SN
 * @since 07/01/2024
 * 
 * Case 1: Vamos imaginar que em um processo seletivo, existe o valor 
 * base salarial de R$ 2.000,00 e o salário pretentido pelo candidato.
 * Vamos elaborar um controle de fluxo onde:
 * - Se o valor salário base, for maior que valor salário pretentido, imprima : 
 *   LIGAR PARA O CANDIDATO;
 * - Senão, Se o valor salário base for igual ao valor salário pretentido, imprima :
 *   LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA;
 * - Senão imprima: AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.
 * 
 * Case 2: Foi solicitado, que nosso sistema garanta que, diante das inúmeras candidaturas
 * sejam selecionados apenas no máximo, 5 candidatos para entrevista, onde o salário pretendido
 * seja menor ou igual ao salário base.
 * 
 * Case 3: Agora é hora de imprimir a lista dos candidatos selecionados, para disponibilizar para
 * o RH entrar em contato.
 * 
 * Case 4: O RH deverá realizar uma ligação, com no máximo 03 tentativas para cada candidato
 * selecionado e caso o candidato atenda, deve-se imprimir:
 * "CONSEGUIMOS CONTATO COM _[CANDIDATO] ``` APÓS **_**[TENTATIVA]`** TENTATIVA(S)" ;**
 *  Do contrário imprima: "NÃO CONSEGUIMOS CONTATO COM O _[CANDIDATO]_".
 */
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"Felipe","Marcia","Isabela","Geovanni","Ana Clara","Julia","Mateus"};
        
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
 
    }

    // Case 4
    public static void entrandoEmContato(String candidato){

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso!");
            }
        }while(continuarTentando && tentativasRealizadas < 3);

            if(atendeu){
                System.out.println("Conseguimos contato com o(a) " + candidato + " na " + tentativasRealizadas + " ligação");
            }else{
                System.out.println("Não conseguimos contato com o(a) " + candidato + " numero maximo de ligação atingida");
            }
        
    }

    // Método auxiliar Case 4
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    // Case 3
    public static void imprimirSelecionados(){
        String [] candidatos = {"Felipe","Marcia","Isabela","Geovanni","Ana Clara","Julia","Mateus"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int i=0; i< candidatos.length; i++){
            System.out.println("O candidato de nº " + (i+1) + " é " + candidatos[i]);
        }
    }

    // Case 2
    public static void SelecaoCandidatos(){
        String [] candidatos = {"Felipe","Marcia","Isabela","Geovanni","Ana Clara","Julia","Mateus"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato: " + candidato + " Solicitou este valor de salário R$" + salarioPretendido);
            if(salarioPretendido <= salarioBase){
                System.out.println("O candidato: " + candidato + " foi selecionado para a vaga" );
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // Case 1
    public static void AnalisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioPretendido > salarioBase){
            System.out.println("Esperar resultados dos outros candidatos");
            }

        else if(salarioPretendido < salarioBase){
            System.out.println("Ligar para o candidato");
            }

        else{
            System.out.println("Renegociar salário com o candidato");
        }
    }
}
