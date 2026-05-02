package maratonajava.javacore.Aintroclasses.test;

import maratonajava.javacore.Aintroclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Jiraya";
        professor.sexo = 'M';
        professor.idade = 52;

        System.out.println("Nome: "+professor.nome+" ,Sexo: "+professor.sexo+" ,Idade: "+professor.idade);
    }
}
