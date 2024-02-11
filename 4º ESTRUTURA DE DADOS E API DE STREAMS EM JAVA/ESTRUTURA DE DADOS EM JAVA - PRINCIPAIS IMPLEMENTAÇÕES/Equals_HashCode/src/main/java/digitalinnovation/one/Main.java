package digitalinnovation.one;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Hyundai"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Ferrari"));

        System.out.println(listaCarros.contains(new Carro("Ford")));

        System.out.println((new Carro("Ford").hashCode()));
        System.out.println(new Carro("Chevrolet").hashCode());

        Carro carro1 = new Carro("Lamb");
        Carro carro2 = new Carro("Ferrari");

        System.out.println(carro1.equals(carro2));
    }
}
