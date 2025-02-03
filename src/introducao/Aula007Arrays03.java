package introducao;

public class Aula007Arrays03 {
    public static void main(String[] args) {
        int[] numeros1 = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};

        for (int i = 0; i < numeros2.length; i++){
            System.out.println(numeros2[i]);
        }
        for (int num : numeros2){
            System.out.println(num);
        }
    }
}
