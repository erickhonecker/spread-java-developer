package Map;

import java.util.HashMap;
import java.util.Map;

public class HashTable {

    public static void main(String[] args) {

        HashMap<String, Integer> estudantes = new HashMap<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);
        estudantes.put("Pedro", 55);

        //Remove um estudante no índice 0
        estudantes.remove("Pedro");

        System.out.println(estudantes);

        //Recupera um estudante no índice 2;
        int idadeEstudante = estudantes.get("Mariana");

        System.out.println(idadeEstudante);

        System.out.println(estudantes.size());

        //Navega nos registros do mapa
        for (Map.Entry<String, Integer> entry : estudantes.entrySet()){
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        //Navega nos registros do mapa
        for (String key: estudantes.keySet()){
            System.out.println(key + " -- " + estudantes.get(key));
        }
        System.out.println(estudantes);

    }
}
