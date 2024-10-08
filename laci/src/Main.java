import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a szöveget: ");
        String szoveg = scanner.nextLine();

        System.out.println("Add meg hányszor akarod kiírni: ");
        short szam = scanner.nextShort();

        for (int i = 0; i < szam; i++) {
            System.out.println(szoveg);
        }
        /*
        for(int i = 0; i < 100; i++){
        System.out.println("Laci");
        }
         */
    }
}