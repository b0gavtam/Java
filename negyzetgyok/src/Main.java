import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("adj meg egy számot: ");
        int szam = scanner.nextInt();
        if (szam < 0) {
            System.out.println("Negatív számból nem vonunk gyököt!");
        }
        else {
            System.out.println("a beírt szám négyzetgyöke: " + Math.sqrt(szam));
        }
    }

}