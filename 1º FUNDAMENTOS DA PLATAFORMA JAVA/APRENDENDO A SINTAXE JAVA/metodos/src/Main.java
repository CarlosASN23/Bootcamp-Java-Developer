public class Main {
    
    public static void main(String[] args){

        // Criação do objeto TV01 para a aplicação dos métodos
        ExercicioTV tv01 = new ExercicioTV(false,2,14);

        // Chamamento dos métodos para o objeto TV01
        tv01.Ligar(true);
        tv01.aumentarCanal(5);
        tv01.aumentarVolume(10);

        // Criação do objeto TV02 para a aplicação dos métodos
        ExercicioTV tv02 = new ExercicioTV(true, 1, 20);

        // Chamamento dos métodos para o objeto TV02
        tv02.Ligar(true);
        tv02.diminuirCanal(10);
        tv02.diminuirVolume(30);
    }
}
