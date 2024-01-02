import java.sql.Date;

public class operadores {
    public static void main(String[] args){

        // Atribuição - representado pelo simbolo  de " = "
        String nome = "Maria";
        int idade = 19;
        double peso = 77.33;
        char sexo = 'M';
        Date dataNascimento = new Date(idade);
        
        // Aritiméticos - Operações Matemáticas
        double soma = 10.5 + 17.22;
        int subtracao = 10 - 7;
        int multiplicacao = 3 * 4;
        int divisao = 6 / 3;
        int modulo = 10 % 2;
    
        // Concatenação
        String concatenacao = 1+1+1+"1"; // 31
        //System.out.println(concatenacao);
        String conca = 1+"1"+1+"1";  // 1111
        //System.out.println(conca);
        String conc = "1"+1+1+1; // 1111
        //System.out.println(conc);
        String tacao = "1"+(1+1+1); // 13
        //System.out.println(tacao);
        String nomeCompleto = " Linguagem " + "Java";
        //System.out.println(nomeCompleto);
        
        /*
        Unários - Utilizados em conjunto com operadores aritmeticos para incrementar, 
        decrementar...
         */ 
        // (+) Operador unário para valor positivo
        // (-) Operador unário para valor negativo
        // (++) Operador unário para incremento de valor
        // (--) Operador unário para decremento de valor
        // (!) Operador lógico para negação

        //classe Operadores.java
        int numero = 5;
                
        //Imprimindo o numero negativo
        System.out.println(- numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);

        // Ternário - Operador de condição entre dois valores substitui o if tradicional
        int a, b;
        a = 5;
        b = 6;

        // estrutura funciona como se fosse um If
        String resultado = a==b ? "verdadeiro" : "falso"; 
        System.out.println(resultado);
       
        // Relacionais - Avaliam a relação entre duas variaveis ou expressões
        /*
         * == Quando desejamos verificar se uma variável é IGUAL A outra.
         * != Quando desejamos verificar se uma variável é DIFERENTE da outra.
         * > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
         * >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
         * < Quando desejamos verificar se uma variável é MENOR QUE outra.
         * <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
         */
        //classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2");

        // ComparacaoAvancada.java
        String nome1 = "JAVA";
        String nome2 = "JAVA";
        
        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");
        
        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true
        
        //equals na parada
        System.out.println(nome1.equals(nome2)); //??
        System.out.println(nome2.equals(nome3)); //??
        System.out.println(nome3.equals(nome4)); //??

        // ComparacaoAvancada.java 
        int num01= 130;
        int num02 = 130;
        System.out.println(num01 == num02); //true
        
        Integer n01 = 130;
        Integer n02 = 130;

        System.out.println(n01 == n02); //false
        
        // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // Como objetos a partir de agora.
        // Qual a solução ?
        // Quando queremos comparar objetos, usamos o método equals
        System.out.println(n01.equals(n02)); 

        // Logico

        // Operadores.java
        boolean condicao1=true;

        boolean condicao2=false;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
        expressões. 
        É como se estivesse escrito:
        "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */

        if(condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");;

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");

        // ComparacaoAvancada.java
        int numero1 = 1;
        int numero2 = 1;

        if(numero1== 2 & numero2 ++ == 2 )
            System.out.println("As 2 condições são verdadeiras");

        System.out.println("O numero 1 agora é " + numero1);
        System.out.println("O numero 2 agora é " + numero2);

    }
}
