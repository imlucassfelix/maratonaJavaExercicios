package maratonajava.intro;

public class Aula05EstruturasCondicionais06 {
    // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
    // Considerando 1 como domingo
    public static void main(String[] args) {
        byte dia = 2;
        switch (dia) {
            case 1:
                System.out.println("Dia 1 é domingo ");
            case 2:
                System.out.println("Dia 2 é segunda ");
            case 3:
                System.out.println("Dia 3 é terça ");
            case 4:
                System.out.println("Dia 4 é quarta ");
            case 5:
                System.out.println("Dia 5 é quinta ");
            case 6:
                System.out.println("Dia 6 é sexta ");
                break;
            case 7:
                System.out.println("Dia 7 é sábado ");
            default:
                System.out.println("Opção inválida");
        }
    }
}
