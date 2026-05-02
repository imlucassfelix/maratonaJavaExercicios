package maratonajava.javacore.Aintroclasses.test;

import maratonajava.javacore.Aintroclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante.nome = "Zoro";

        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println("--------------");
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
    }
}
