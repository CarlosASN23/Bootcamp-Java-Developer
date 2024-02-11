package one.digitall;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Carro> listCarros = new ArrayList<>();
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Ferrari"));
        listCarros.add(new Carro("Mayback"));
        listCarros.add(new Carro("Hyundai"));

        System.out.println(listCarros.contains(new Carro("Ferrari")));

        System.out.println(listCarros.get(2));

        System.out.println(listCarros.indexOf(new Carro("Hyundai")));

        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);

    }
}
