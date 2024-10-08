import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg az alapárat: ");
        int alapar = scanner.nextInt();
        System.out.println("az első szöveg: " + alapar);

        System.out.println("Add meg az áremelés értékét százalékban: ");
        float aremeles = scanner.nextFloat();
        System.out.println("az első szöveg: " + aremeles);

        System.out.println("A megemelt ár:" + Math.floor((alapar * (100+aremeles))));
    }
}