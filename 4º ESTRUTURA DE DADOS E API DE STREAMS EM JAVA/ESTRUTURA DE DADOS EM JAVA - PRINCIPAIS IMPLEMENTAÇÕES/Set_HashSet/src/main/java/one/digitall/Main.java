package one.digitall;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args){
        Set<Carro> hashSetCarros= new HashSet<>();

        hashSetCarros.add(new Carro("Toyota"));
        hashSetCarros.add(new Carro("Ferraria"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Wolkswagem"));
        hashSetCarros.add(new Carro("Renault"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();
        treeSetCarros.add(new Carro("Toyota"));
        treeSetCarros.add(new Carro("Ferraria"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Wolkswagem"));
        treeSetCarros.add(new Carro("Renault"));

        System.out.println(treeSetCarros);



    }
}
