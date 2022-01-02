package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();

        //HashSet não mantem a ordem de adição, para ter mais performace, na inserção, remoção e busca.
        //adicona as notas no set
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);

        notasAlunos.remove(3.8);
        System.out.println(notasAlunos);

        System.out.println(notasAlunos.size());

        Iterator<Double> iterator = notasAlunos.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Double nota: notasAlunos) {
            System.out.println(nota);

        }
        //notasAlunos.clear();

        //Retorna se o set está vazio ou não
        System.out.println(notasAlunos.isEmpty());
    }
}
