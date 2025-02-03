package introducao;

public class Aula006EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorTtoal = 30000;
        for (int parcela = (int) valorTtoal; parcela >= valorTtoal; parcela--){
            double valorParcela = valorTtoal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$  " + valorParcela);
        }
    }
}
