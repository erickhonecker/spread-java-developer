package Map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

        Map<String, Integer> campeoesMudialFifa = new HashMap<>();

        // Adiciona os campeões mundiais fifa no mapa
        campeoesMudialFifa.put("Brasil", 5);
        campeoesMudialFifa.put("Alemanha", 4);
        campeoesMudialFifa.put("Itália", 4);
        campeoesMudialFifa.put("Urugaui", 2);
        campeoesMudialFifa.put("Argentina", 2);
        campeoesMudialFifa.put("França", 2);
        campeoesMudialFifa.put("Inglaterra", 1);
        campeoesMudialFifa.put("Espanha", 1);

        System.out.println(campeoesMudialFifa);

        //Atualiza o valor para chave Brasil
        campeoesMudialFifa.put("Brasil", 6);
        System.out.println(campeoesMudialFifa);

        //Retorno a Argentina
        System.out.println(campeoesMudialFifa.get("Argentina"));

        //Retorna se existe ou não um campeão França
        System.out.println(campeoesMudialFifa.containsKey("França"));

        //Remove o campeão França
        campeoesMudialFifa.remove("França");

        //Retorno se existe ou não um campeão França
        System.out.println(campeoesMudialFifa.containsKey("França"));

        //Retorno se existe ou não alguma seleção hexa campeã
        System.out.println(campeoesMudialFifa.containsKey(6));

        //Retorno o tamanho do mapa
        System.out.println(campeoesMudialFifa.size());
        System.out.println(campeoesMudialFifa);

        //Navega nos registros do mapa
        for(Map.Entry<String, Integer> entry : campeoesMudialFifa.entrySet()){
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

        //Navega nos Registros do mapa
        for (String key : campeoesMudialFifa.keySet()){
            System.out.println(key + "--"+ campeoesMudialFifa.get(key));
        }

        System.out.println(campeoesMudialFifa);

        //Verfica se o mapa contem a chave Estados Unidos
        System.out.println(campeoesMudialFifa.containsKey("Estados Unidos"));

        //Verifica se o mapa contem o valor 5
        System.out.println(campeoesMudialFifa.containsValue(5));

        //Verifica o tamanho antes e depois de limpar o mapa
        System.out.println(campeoesMudialFifa.size());
        campeoesMudialFifa.clear();

        System.out.println(campeoesMudialFifa.size());





    }
}
