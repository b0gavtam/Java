import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int osszeg= 0;
        System.out.println("az intervallum also vegpontja: ");
        int szam = scanner.nextInt();
        System.out.println("intervallum felso vegpontja: ");
        int szam2 = scanner.nextInt();
        for (int i = szam; i <= szam2; i++) {
            if (i % 2 == 0) {
                osszeg+=i;
            }

        }
        System.out.println("az intervallumba eső páros számok összege: " + osszeg);
    }
}