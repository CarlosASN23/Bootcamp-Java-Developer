package edu.carlos.segundasemana;
public class MinhaClasse{

    public static void main(String[] args){
        
        /*int ano = 2021;
        final String BR = "Brazil"; // A palavra reservada final pressupõe que a variavel 
                                    // não pode sofrer alterações
        String meuNome = "Carlos";
        int anoFabricacao = 2022;
        boolean verdadeiro = true;*/

        String primeiroNome = "Carlos";
        String segundoNome = "Alberto";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {

        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}