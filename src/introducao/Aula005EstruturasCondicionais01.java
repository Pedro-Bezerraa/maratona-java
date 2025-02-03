package introducao;

public class Aula005EstruturasCondicionais01 {
    public static void main(String[] args) {
         int idade = 5;
         boolean isAutorized = idade >= 18;
         if (isAutorized){
             System.out.println("Pode comprar bebida alcoolica.");
         } else {
             System.out.println("Não Pode comprar bebida alcoolica.");
         }

         if (!isAutorized){
             System.out.println("Não Pode comprar bebida alcoolica.");
         }


    }
}
