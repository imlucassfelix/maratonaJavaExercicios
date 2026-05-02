package maratonajava.javacore.Aintroclasses.test;

import maratonajava.javacore.Aintroclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.sexo = 'M';
        estudante.idade = 19;

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        System.out.println(estudante);
    }
}
