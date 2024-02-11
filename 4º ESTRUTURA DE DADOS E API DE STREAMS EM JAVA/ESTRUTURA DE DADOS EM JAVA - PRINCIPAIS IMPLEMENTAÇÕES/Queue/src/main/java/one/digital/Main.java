package one.digital;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args){
        Queue<Carro> queueCarros = new LinkedList<>();
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Ferrari"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Toyota")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Fusca")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());

        System.out.println(queueCarros.size());


    }
}
