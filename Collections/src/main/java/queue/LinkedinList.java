package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedinList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        // metodo "poll" remove o primeiro item da fila
        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido); // mostra o cliente a ser atendido
        System.out.println(filaBanco); // imprimi a fila do banco atual

        // retorno o primeiro elemento da lista, caso não tenha elementos na mesma, retorna null
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);

        // retorno o primeiro elemento da lista, caso não tenha elementos na mesma, retorna um erro
        String primeiroClienteouErro = filaBanco.element();
        System.out.println(primeiroClienteouErro);
        System.out.println(filaBanco);

        for (String cliente: filaBanco) {
            System.out.println(cliente);

        }
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        //percorre toda fila
        while(iteratorFilaBanco.hasNext()){
            System.out.println("---->"+iteratorFilaBanco.next());


        }
        // retorna o tamanho da fila
        System.out.println(filaBanco.size());
        //retorna se a fila está vazia
        System.out.println(filaBanco.isEmpty());

    }
}
