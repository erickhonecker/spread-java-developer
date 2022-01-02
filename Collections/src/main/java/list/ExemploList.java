package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

            // adiciona itens na lista
            nomes.add("Carlos");
            nomes.add("Pedro");
            nomes.add("Juliana");
            nomes.add("Maria");
            nomes.add("João");
            nomes.add("Anderson");

            System.out.println(nomes);
            // troca a item da lista
            nomes.set(2, "Larissa");
            System.out.println(nomes);

            // ordena os itens da lista
            Collections.sort(nomes);
            System.out.println(nomes);

            // remove o itens da lista de acordo com index passado
            nomes.remove(4);
            System.out.println(nomes);

            // remove o iten da lista de acordo com o objeto(nome do item) passado.
            nomes.remove("Pedro");
            System.out.println(nomes);

            // cria uma variavel String e armazena o item de acordo com index passado
            String nome = nomes.get(1);
            System.out.println(nome);

            // cria uma variavel int e armazena o tamanho da Lista
            int tamanho = nomes.size();
            System.out.println(tamanho);

            // remove mais um iten da lista
            nomes.remove("Larissa");

            //imprimi mais uma vez o tamanho da lista atualizada
            tamanho = nomes.size();
            System.out.println(tamanho);

            int posicao = nomes.indexOf("João");
            System.out.println("Index --> " + posicao);

            //verfica se contém o item Anderson na lista e retorna um valor booelano true or false
            boolean temAnderson = nomes.contains("Anderson");
            System.out.println(temAnderson);

            //verfica se contém o item Anderson na lista e retorna um valor booelano true or false
            boolean temFernando = nomes.contains("Fernando");
            System.out.println(temFernando);

            //verfica se lista está vazia e retorna um valor booelano true or false
            boolean listaVazia = nomes.isEmpty();
            System.out.println(listaVazia);


            for(String nomeDoItem: nomes){
                System.out.println("Nome do Item --> "+ nomeDoItem);
            }

            //percorrendo a lista com iterator
            Iterator<String> iterator = nomes.iterator();
            while(iterator.hasNext()){
                System.out.println("Nome do Item_---->" + iterator.next());
            }

            // limpa uma lista
            nomes.clear();

            //verfica se lista está vazia e retorna um valor booelano true or false
             listaVazia = nomes.isEmpty();
             System.out.println(listaVazia);



    }

}
