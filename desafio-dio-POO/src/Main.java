import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();

        //criando um objeto curso
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraira(8);

        //Instancia do objeto curso
        Curso curso2 = new Curso();

        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição Curso de JavaScript");
        curso2.setCargaHoraira(4);

        //Instancia do objeto metoria
        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descrição BootCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        System.out.println("------------ Dev Camila ---------");
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos Inscritos " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println(" ");
        System.out.println("Conteúdos Inscritos " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devCamila.getConteudosConcluidos());
        System.out.println("XP -->  " + devCamila.calcularTotalXp());
        System.out.println("--------------------- \n");

        Dev devJoao = new Dev();
        System.out.println("------------ Dev João ---------");
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos Inscritos " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println(" ");
        System.out.println("Conteúdos Inscritos " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devJoao.getConteudosConcluidos());
        System.out.println("XP -->  " + devJoao.calcularTotalXp());
        System.out.println(" --------------");

        //impressões dos objetos
//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);



    }
}
