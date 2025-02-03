package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Prisma";
        carro1.modelo = "Sedan";
        carro1.ano = 2017;

        carro2.nome = "Celta";
        carro2.modelo = "Pequeno";
        carro2.ano = 2000;

        System.out.println("Nome: " + carro1.nome + " - Modelo: " + carro1.modelo + " - Ano: " + carro1.ano);
        System.out.println("Nome: " + carro2.nome + " - Modelo: " + carro2.modelo + " - Ano: " + carro2.ano);

        carro1 = carro2;
        System.out.println("Nome: " + carro1.nome + " - Modelo: " + carro1.modelo + " - Ano: " + carro1.ano);

    }
}
