package maratonajava.intro;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+-/*
        int numero01 = 10;
        int numero02 = 20;
        int soma = numero01 + numero02;
        double resultado = numero01 / (double) numero02;
        System.out.println("valor" + numero02 + numero01);
        System.out.println(numero02 + numero01 + "valor" + numero02 + numero01);
        System.out.println("soma" + soma);
        System.out.println(resultado);
        // % = resto;
        int resto = 21 % 7;
        System.out.println(resto);
        // < = menor;  > = maior; <= menor/igual; >= maior/igual; == comparação; != diferente (eles sempre retornam valores booleanos)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

        // &&(AND); || (or); ! = negação
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        //= += -= *= %=
        double bonus = 1800;
        bonus += 2000; //3800
        bonus -= 2000; //1800
        bonus *= 2;  //3600
        bonus /= 2;  //900

        System.out.println("bonus "+bonus);

        //
        int contador = 0;
        contador +=  1; // contador = contador + 1
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println("contador "+contador);
        int contador2 = 0;
        System.out.println(++contador2); // nesse caso justifica o uso do "++" antes para começar o contador na mesma linha;
        System.out.println(contador2++); // imprime a variável (contador2 = 0) e depois implementa mais um no próximo sout;
        System.out.println(contador2);
    }
}
