import java.util.Scanner;
public class Modif2NestedLoop {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double[][] temps = new double[5][7];
    
    for (int i = 0; i < temps.length; i++) {
        System.out.println("City: " + i);
        for (int j = 0; j < temps[0].length; j++) {
            System.out.print("Day " + (j+1) + ": ");
            temps[i][j] = scanner.nextDouble();
        }
        System.out.println();
    }

    for (int i = 0; i < temps.length; i++) {
        System.out.println("City: " +i);
        double jumlah = 0;
        for (double temp : temps[i]) {
            System.out.print(temp + " ");
            jumlah += temp;
        }
        double rataRata = jumlah / temps[i].length;
        System.out.println("Rata-rata suhu adalah " + rataRata);
        System.out.println();
    }
    }
}
