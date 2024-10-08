import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int fibo(int n){
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        for (int i = 2; i <= n; i++) {
            fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i-2));
        }
        return fibonacci.get(n);
    }
    

    public static void main(String[] args) {
        System.out.println(fibo(10));
        System.out.println(fibo(42));

    }
}