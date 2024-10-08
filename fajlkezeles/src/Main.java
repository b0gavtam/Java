import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        //a fájlba manuálisan írt dolgokat a filewriter kitörli futtatáskor
        ArrayList<String> nevek = new ArrayList<>();
        nevek.add("Pisti");
        nevek.add("Sanyi");
        System.out.println("nevek =" + nevek);
    try{
       FileWriter writer = new FileWriter("szoveg.txt");
        for(String nev : nevek){
            writer.write(nev + "\n");

        }
       writer.close();
    } catch (IOException e) {
        System.out.println(e.getMessage());
        //runtime exceptionnél crashel, így viszont nem
        */
        ArrayList<String> szoveg = new ArrayList<>();
        try{
            File f = new File("szoveg.txt") ;
            Scanner scanner = new Scanner(f);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                szoveg.add(line);
            }
            scanner.close();
            System.out.println(szoveg);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}

