/**
 * @author Carlos Alberto S.N
 * @Since 02/01/2024
 * A classe abaixo refere-se a construção de métodos para colocar em 
 * pratica os conteúdos aprendidos durante o curso Bootcamp Java Developer
 * da DIO
 * 
 */
public class ExercicioTV {

    // Inicialização das variaveis
    boolean ligada = true;
    int canal = 1;
    int volume = 25;

    // Construtor com passagem de parâmetros
    public ExercicioTV(boolean ligada, int canal, int volume) {
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }

    /** 
     * Criação do método booleano para verificar status da TV (Ligada/Desligada)
     * @param ligada variavel booleana que verificará o status da TV (Ligada/Deslig)
     * @return  em caso da variavel ligada estiver recebendo o status
     * True (verdadeiro) será impresso a mensagem descrita no comando SOUT
     * dentro do bloco condicional if, em caso contrário será impresso a mensagem
     * condicional dentro do bloco else
     */ 
    public boolean Ligar(Boolean ligada){

        if (this.ligada == true){

            System.out.println("A TV esta ligada!");
            return this.ligada;

        }else{

            System.out.println("A TV não esta Ligada!");
            return this.ligada;
        }
    }

    /**
     * Criação do método para mudar o canal (canais acima do atual)
     * @param x irá receber o valor de canais a ser alterado
     * @return O código passará por um bloco condicional onde será testado 
     * para o caso do valor da variavel x for maior que zero, em caso positivo 
     * a variavel novoCanal que consiste na soma da variavel canal + x irá apresentar
     * o novo canal aumentado. Em caso de cair no bloco condicional else será apresentado
     * uma mensagem contendo um erro ao tentar mudar de canal
     */
    public int aumentarCanal(int x){

        if (x > 0){
            
            int novoCanal = this.canal + x;
            System.out.println("Canal alterado com sucesso para: " + novoCanal );
            return novoCanal;
        }
        else{

            System.out.println("Não foi possivel alterar o canal!");
            return this.canal;
        }    
    }

     /**
     * Criação do método para mudar o canal (canais abaixo do atual)
     * @param x irá receber o valor de canais a ser alterado
     * @return O código passará por um bloco condicional onde será testado 
     * para o caso do valor da variavel x for maior que zero e menor que canal,
     * em caso positivo a variavel novoCanal que consiste na 
     * subtração da variavel canal - x irá apresentar
     * o novo canal diminuido. Em caso de cair no bloco condicional else será apresentado
     * uma mensagem contendo um erro ao tentar mudar de canal
     */
    public int diminuirCanal(int x){

        if (x > 0 && x < this.canal){

            int novoCanal = this.canal - x;

            if (novoCanal > 0){
                System.out.println("Canal alterado com sucesso para: " + novoCanal);
                return novoCanal;
            }else{      
                System.out.println("Canal não pode ser alterado!");
                return this.canal;
            }
        }else{
            System.out.println("Não foi possivel alterar o canal!");
            return this.canal;
        }
    }

     /**
     * Criação do método para mudar o volume da TV (volumes acima do atual)
     * @param x irá receber o valor de volumes a ser alterado
     * @return O código passará por um bloco condicional onde será testado 
     * para o caso do valor da variavel x for maior que zero, em caso positivo 
     * a variavel novoVolume que consiste na soma da variavel volume + x irá apresentar
     * o novo volume aumentado. Em caso de cair no bloco condicional else será apresentado
     * uma mensagem contendo um erro ao tentar alterar o volume
     */
    public int aumentarVolume(int x){

        if (x > 0){

            int novoVolume = x + this.volume;

            System.out.println("Volume aumentado com sucesso: " + novoVolume);
            return novoVolume;
        }else{

            System.out.println("Não foi possivel alterar o volume!");
            return this.volume;
        }
    }

      /**
     * Criação do método para mudar o volume da TV(volume abaixo do atual)
     * @param x irá receber o valor de volumes a ser alterado
     * @return O código passará por um bloco condicional onde será testado 
     * para o caso do valor da variavel x for maior que zero e menor que volume,
     * em caso positivo a variavel novoVolume que consiste na 
     * subtração da variavel volume - x irá apresentar
     * o novo volume diminuido. Em caso de cair no bloco condicional else será apresentado
     * uma mensagem contendo um erro ao tentar alterar o volume
     */
    public int diminuirVolume(int x){

        if (x > 0 && x < this.volume){

            int novoVolume = this.volume - x;
            System.out.println("Volume diminuido com sucesso: " + novoVolume);
            return novoVolume;
        }else if (x > 0 && x > this.volume){

            System.out.println("Não foi possivel diminuir o volume");
            return this.volume;
        }else{
            System.out.println("Não foi possivel alterar o volume");
            return this.volume;
        }
    }
}
