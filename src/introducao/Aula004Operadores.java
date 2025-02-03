package introducao;

import java.sql.SQLOutput;

public class Aula004Operadores {
    public static void main(String[] args) {
//        // + - / *
//        int num1 = 18;
//        int num2 = 20;
//
//        int soma = (num2 + num1);
//        int subtracao = (num2 - num1);
//        int multiplicacao = (num1 * num2);
//        int divisao = (num2 / num1);
//
//        System.out.println(soma);
//        System.out.println(subtracao);
//        System.out.println(divisao);
//        System.out.println(multiplicacao);
//
//        //% - resto da divisão
//        int resto = 20 % 3;
//        System.out.println(resto);
//
//        // < > maior ou menor / <= >= menor irgual ou maior igual == igual != diferente
//        boolean dezMaiorQueVinte = 10 < 20;
//        boolean dezMaiorQueVinte2 = 10 > 20;
//        System.out.println(dezMaiorQueVinte);
//        System.out.println(dezMaiorQueVinte2);

        //&& and/e   || or/ou !
        int age = 26;
        double salario = 3500;
        boolean isDentroDaLei = age > 30 && salario > 4612;
        boolean isDetroDaLeiMenorQueTrinta = age < 30 && salario >= 3381;

        System.out.println(isDentroDaLei);
        System.out.println(isDetroDaLeiMenorQueTrinta);

//        double valorTotalContaCorrente = 200;
//        double valorTotalContaPoupanca = 10000;
//        float valorPlaystation = 5000F;
//        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
//        System.out.println(isPlaystationCincoCompravel);
//
//        double bonus = 1800;
//        bonus %= 1000;
//
//        System.out.println(bonus);
//
//        int contador = 0;
//        contador++;
//        contador--;
    }
}
