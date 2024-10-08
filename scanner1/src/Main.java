public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy szöveget: ");
        String szoveg1 = scanner.nextLine();
        System.out.println("az első szöveg: " + szoveg1);

        System.out.println("Adjon meg egy másik szöveget: ");
        String szoveg2 = scanner.nextLine();
        System.out.println("az első szöveg: " + szoveg2);

        System.out.println("A két szöveg összetéve:" + (szoveg1 + szoveg2));

    }
}