package maratonajava.intro;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salario > 5000
        double salario = 3000.00;
        String msgDoar = "Eu vou doar R$300,00 para mim mesmo para apartamento";
        String msgNaoDoar = "Eu ainda não consigo doar os  R$300,00 pra mim mesmo";
        boolean possoDoar = salario > 5000.00;
        String resultado = salario > 5000.00 ? msgDoar : msgNaoDoar;
        System.out.println(resultado);
        System.out.println(possoDoar);
    }
}
