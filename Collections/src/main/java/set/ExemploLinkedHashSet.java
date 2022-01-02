package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {
        java.util.LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
        // adiciona os elementos na set
        sequenciaNumerica.add(16);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(1);

        System.out.println(sequenciaNumerica);

        //Remove o número do set
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        //Retona a quantidade de itens do set
        System.out.println(sequenciaNumerica.size());

        // Navega em todos os itens do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //percorre e retorna todos os elementos do set
        for (Integer numero: sequenciaNumerica) {
            System.out.println(sequenciaNumerica);

        }
        //Retorna se o set está vazio ou não
        System.out.println(sequenciaNumerica.isEmpty());
    }

}
