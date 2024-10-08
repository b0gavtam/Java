//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Szemely szemely = new Szemely("LaJOS", 17);
        System.out.println(szemely.getNev());
        szemely.setEletkor(30);
        System.out.println("szemely = " + szemely);
    }
}