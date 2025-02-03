package introducao;

public class Aula002TiposPrimitivos {
    public static void main(String[] args) {
        //long, boolean, int, double, float, char, byte, short
        int age = (int) 13000000000L;
        long numberLong = 2000000L;
        double salarioDouble = 1240.4390;
        float salarioFloat = 1423.50F;
        byte ageByte = 29;
        short ageShort = 14;
        boolean falso = false;
        boolean verdadeiro = true;
        char letra = 'a';

        String palavras = "String é capaz de guarda esta frase inteira.";

        System.out.println("A idade dele é de " + age + " anos.");
        System.out.println(verdadeiro);
        System.out.println(salarioDouble);
        System.out.println(age);
        System.out.println(palavras);
    }
}
