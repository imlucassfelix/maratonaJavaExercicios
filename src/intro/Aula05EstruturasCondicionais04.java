package maratonajava.intro;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 25000.00;
        double taxa;
        if (salario <= 34712.00){
            taxa = (salario / 100) * 9.70;
        } else if (salario >= 34713.00 && salario <= 68507.00){
            taxa = (salario / 100) * 37.35;
        } else{
            taxa = (salario / 100) * 49.50;
        }
        System.out.println("O salário anual de R$"+salario+" foi taxado em: R$"+taxa);
    }
}
