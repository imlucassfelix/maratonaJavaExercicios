package maratonajava.javacore.Aintroclasses.test;

import maratonajava.javacore.Aintroclasses.dominio.Carro;

public class CarroTest01 {
    //Exercicio Crie uma classe carro com atributos: nome, modelo, ano
    //Em seguida, crie dois objetos distintos e imprima seus valores
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Uno";
        carro.modelo = "Escada";
        carro.ano = 2005;

        carro2.nome = "Gol";
        carro2.modelo = "Bolinha";
        carro2.ano = 2001;

        carro2 = carro;

        System.out.println("Carro1: ");
        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);

        System.out.println("-------");

        System.out.println("Carro2: ");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
