package maratonajava.javacore.Bintrometodos.test;

import maratonajava.javacore.Bintrometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double result =  calc.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println(calc.divideDoisNumeros(20,2));

    }
}
