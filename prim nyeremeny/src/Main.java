import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add meg a csoki gyartasi sorszamat:");
        int sorszam = scanner.nextInt();
        boolean isPrime = true;
        System.out.println("sorszam = " + sorszam);
        for (int i = 2; i < sorszam; i++) {
            if (sorszam % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("Gratulalok, nyertel!");
        }
        else{
            System.out.println("Sajnos nem nyert!");
        }
    }
}
