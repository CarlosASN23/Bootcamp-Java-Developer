package com.projeto.atribuicaoreferencia;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args){

        int intA = 1;
        int intB = intA;

        System.out.println("intA = " + intA + " intB =" + intB );
        intA = 2;
        System.out.println("intA = " + intA + " intB =" + intB);
        /*O tipo primitivo intB continuará a receber o valor 1
        * pois ao copiar o valor da variavel intA no primeiro momento
        * o Java copiou o exatamente o valor alocado (codigo binario) na memória e não o
        * espaço onde o valor foi alocado */

        MeuObjeto objA = new MeuObjeto(1);
        MeuObjeto objB = objA;
        System.out.println("objA= " + objA + " objB =" + objB);
        objA.setnum(2);
        System.out.println("objA= " + objA + " objB =" + objB);
        /*
        * Diferentemente dos tipos primitivos ao atribuirmos o objB = objA
        * estamos atribuindo ao objB o mesmo espaço de memória em que o objA
        * esta constando, o que faz com que ao alterarmos o valor do objA
        * se altere também o valor do objB (alteração do valor no espaço da memória)*/
    }
}
