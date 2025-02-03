package introducao;

public class Aula005EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 10000;
        String msgDoar = "Eu vou doar 500 conto!";
        String msgNaoDoar = "Eu não vou doar 500 conto!";
        String resultado = salario > 5000 ? msgDoar : msgNaoDoar;
        // resultado = condição ? verdadeiro : falso


//        if (salarios > 5000){
//            resultado = msgDoar;
//        }else {
//            resultado = msgNaoDoar;
//        }
        System.out.println(resultado);
    }
}
