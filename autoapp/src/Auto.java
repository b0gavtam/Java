import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Auto {
    private int sorszam;
    File fr = new File("../autok.csv");
    Scanner scanner = new Scanner(fr);


    public Auto(String line) {
         line = scanner.nextLine();
        String[] splitline = line.split(";");
        int sorszam = Integer.parseInt(splitline[0]);
        String marka = splitline[1];
        String modell = splitline[2];
        int gyartasiev = Integer.parseInt(splitline[3]);
        String szin = splitline[4];
        int eladottdarabszam = Integer.parseInt(splitline[5]);
        int atlageladasiar = Integer.parseInt(splitline[6]);
    }
    public static ArrayList<Auto> Hozzaad(File file){
        try {
            Scanner scanner1 = new Scanner(file);


        } catch (FileNotFoundException e) {
            System.out.println("e = " + e);
        }
        ArrayList<Auto> autolista = new ArrayList<Auto>();
        return autolista;
    }
}
