package set;


import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {
        java.util.TreeSet<String> treeCapitais = new TreeSet<>();

        //Monta a árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        //Retorna a última capital no final da árvore
        System.out.println(treeCapitais.last());

        //Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));

        //Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));

        //Exibi todas as capitais no console
        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore, removenod do set
        System.out.println(treeCapitais.pollFirst());

        //Retorna a primeira capital no final da árvore, removenod do set
        System.out.println(treeCapitais.pollLast());

        //Retorna a primeira capital no final da árvore, removendo do set
        System.out.println(treeCapitais);

        //Navegador em todas os itens do iterator
        Iterator<String> iterator = treeCapitais.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String capital: treeCapitais){
            System.out.println(capital);
        }
    }

}
