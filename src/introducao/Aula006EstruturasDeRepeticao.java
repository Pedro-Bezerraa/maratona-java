package introducao;

public class Aula006EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while, do while, for

        int rep = 0;
//        while (rep < 10){
//            System.out.println(rep);
//            rep++;
//        }

        do {
            System.out.println("--------> " + rep + " <-------");
            rep++;
        } while (rep <= 5);

        for (int i = 10; i > 1; i--){
            System.out.println("AAAAAAA");
        }
    }
}
