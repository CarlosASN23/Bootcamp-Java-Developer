package digitalinnovation.one;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;


public class Main {

    public static void main(String[] args){

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "João");
        aluno.put("Idade", "20");
        aluno.put("Media", "9.75");
        aluno.put("Turma", "3ª");
        aluno.put("Escola", "Esocla do Barão");

        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map <String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Joana");
        aluno2.put("Idade", "19");
        aluno2.put("Media", "10");
        aluno2.put("Turma", "2ª");
        aluno2.put("Escola", "Esocla do Tenente");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);
        System.out.println(aluno.containsKey("Nome"));
        
    }
}
