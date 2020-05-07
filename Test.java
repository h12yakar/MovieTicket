import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
            System.out.println("Hoşgeldiniz");
            Scanner user = new Scanner(System.in);
            System.out.println("Bilet almak için 1, gün sonu almak için 2 alınız");
            int log = user.nextInt();
            Sinema sinema = new Sinema();
            if (log == 1) {
                System.out.println("Film ismini girin: ");
                String filminAdı = user.next();

                Sinema isimliSinema = new Sinema(filminAdı);
                sinema.satis();
            } else if (log == 2) {
                sinema.yazdir();
            }

    }
}
