package introducao;

public class Aula005EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 70000;
        double imposto1 = 9.70/100;
        double imposto2 = 37.35/100;
        double imposto3 = 49.50/100;
        double valorImposto;

        if (salario <= 34712){
            valorImposto = salario * imposto1;
        } else if (salario >= 34723 && salario <= 68507) {
            valorImposto = salario * imposto2;
        } else {
            valorImposto = salario * imposto3;
        }
        System.out.println(valorImposto);
    }
}
