package br.com.dio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(0);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAnna = new Dev();
        devAnna.setNome("Anna");
        devAnna.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Anna:" + devAnna.getConteudosInscritos());
        devAnna.progredir();
        devAnna.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Anna:" + devAnna.getConteudosInscritos());
        System.out.println("Conteudos Conluidos Anna:" + devAnna.getConteudosConcluidos());
        System.out.println("XP:" + devAnna.calcularTotalXp());

        System.out.println("-------");

        Dev devDavi = new Dev();
        devDavi.setNome("Davi");
        devDavi.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Davi:" + devDavi.getConteudosInscritos());
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        System.out.println("-");
        System.out.println("Conteudos Conluidos Davi:" + devAnna.getConteudosInscritos());
        System.out.println("Conteudos Conluidos Davi:" + devAnna.getConteudosConcluidos());
        System.out.println("XP:" + devDavi.calcularTotalXp());




    }
}
