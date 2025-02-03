package introducao;

public class Aula006EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorTtoal = 30000;
        for (int parcela = 1; parcela <= valorTtoal; parcela++){
            double valorParcela = valorTtoal / parcela;
            if (valorParcela >= 1000){
                System.out.println("Parcela " + parcela + " R$  " + valorParcela);
            } else {
                break;
            }
        }
    }
}
