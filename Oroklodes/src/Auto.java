public class Auto extends Jarmu {
    private int kerekekszama;
    private int ajtokszama;
    public Auto(int loero, int vegsebesseg, String szin, int kerekekszama, int ajtokszama) {
        super(loero, vegsebesseg, szin);
        this.ajtokszama = ajtokszama;
        this.kerekekszama = ajtokszama;
    }
    public void Dudal(){
        System.out.println("tütü");
    }
    @Override
    public String toString() {
        return "Auto{" +
                "kerekekszama=" + kerekekszama +
                ", ajtokszama=" + ajtokszama +
                ", loero=" + loero +
                ", vegsebesseg=" + vegsebesseg +
                ", szin='" + szin + '\'' +
                '}';
    }
}
