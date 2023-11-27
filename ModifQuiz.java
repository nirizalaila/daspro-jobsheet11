import java.util.Random;
import java.util.Scanner;

public class ModifQuiz {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Random rand = new Random();
       
       char menu = 'y';
       do {
        int number = rand.nextInt(10) + 1;
        boolean success = false;
        do {
            System.out.print("Tebak angka (1-10): ");
            int answer = input.nextInt();
            input.nextLine();
            success = (answer == number);
            if (answer<number) {
                System.out.println("Angka yang anda masukkan lebih kecil dari jawaban benar");
            } else if (answer>number) {
                System.out.println("Angka yang anda masukkan lebih besar dari jawaban benar");
            } else {
                System.out.println("Selamat tebakan Anda benar!");
                success = true;
            }
        } while (!success);
        System.out.print("Apakah Anda ingin mengulang permainan (Y/T)");
        menu = input.next().charAt(0);
        input.nextLine();
       } while (menu == 'Y' || menu == 'y');
   
    }
}
