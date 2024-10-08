//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Auto a = new Auto(500,350,"piros", 5,4);
        System.out.println("a = " + a);
        Motor m = new Motor(50,150,"piros", true);
        System.out.println("m = " + m);
        a.Dudal();
        m.Dudal();
        }
    }
