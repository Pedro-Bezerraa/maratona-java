package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Juruba");
        funcionario.setIdade(20);
        funcionario.setSalarios(new double[]{1567, 1374, 1937});
        funcionario.imprime();
        System.out.println("Média " + funcionario.getMedia());
    }
}
