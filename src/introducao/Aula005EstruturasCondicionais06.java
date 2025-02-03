package introducao;

public class Aula005EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Domwngo - Dia não útil");
                break;
            case 2:
                System.out.println("Segunda-Feira - Dia útil");
                break;
            case 3:
                System.out.println("Terça-Feira - Dia útil");
                break;
            case 4:
                System.out.println("Quarta-Feira - Dia útil");
                break;
            case 5:
                System.out.println("Quinta-Feira - Dia útil");
                break;
            case 6:
                System.out.println("Sexta-Feira - Dia útil");
                break;
            case 7:
                System.out.println("Sábado - Dia não útil");
                break;
        }
    }
}
