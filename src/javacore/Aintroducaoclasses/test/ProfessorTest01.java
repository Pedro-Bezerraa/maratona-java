package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Kame";
        professor.idade = 30;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " /Idade: " + professor.idade + " /Sexo: " + professor.sexo) ;

    }
}
