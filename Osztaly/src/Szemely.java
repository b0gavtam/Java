public class Szemely {
    private String nev;
    private int eletkor;

    public Szemely(String nev, int eletkor){
        this.eletkor = eletkor;
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getEletkor() {
        return eletkor;
    }

    public void setEletkor(int eletkor) {
        this.eletkor = eletkor;
    }


    //átírás nélkül az osztály nevét és memóriareferenciáját adja vissza
    @Override
    public String toString() {
        return "Szemely{" +
                "nev='" + nev + '\'' +
                ", eletkor=" + eletkor +
                '}';
    }
}
