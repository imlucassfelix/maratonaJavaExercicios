package maratonajava.intro;

public class Aula05EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
        // Condição é que o valor da parcela tem que ser >= 1000
        double valorCarro = 45000;
        for (int parcela = 1; parcela <= valorCarro; parcela++ ) {
            double valorParcela = valorCarro / parcela;
            if(valorParcela < 1000){
                break;
            }
                System.out.println(" Parcela " +parcela+ " R$ " +valorParcela);
        }

    }
}
