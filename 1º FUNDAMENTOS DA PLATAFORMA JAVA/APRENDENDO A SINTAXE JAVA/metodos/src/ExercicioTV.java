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

    // Criação do método booleano para verificar status da TV (Ligada/Desligada)
    public boolean Ligar(Boolean ligada){

        if (this.ligada == true){

            System.out.println("A TV esta ligada!");
            return this.ligada;

        }else{

            System.out.println("A TV não esta Ligada!");
            return this.ligada;
        }
    }

    // Criação do método para mudar o canal (canais acima do atual)
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

    // Criação do método para diminuir o numero do canal (referente ao canal atual)
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
    // Criação do método para aumentar o volume da TV
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

    // Criação do método para diminuir o volume da TV
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
