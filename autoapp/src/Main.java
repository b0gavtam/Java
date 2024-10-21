import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File fr = new File("autok.csv");
        try {
            Scanner scanner = new Scanner(fr);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] splitline = line.split(";");
                int sorszam = Integer.parseInt(splitline[0]);
                String marka = splitline[1];
                String modell = splitline[2];
                int gyartasiev = Integer.parseInt(splitline[3]);
                String szin = splitline[4];
                int eladottdarabszam = Integer.parseInt(splitline[5]);
                int atlageladasiar = Integer.parseInt(splitline[6]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("e = " + e);
        }


    }

}