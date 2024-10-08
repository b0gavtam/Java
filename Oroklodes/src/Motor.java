public class Motor extends Jarmu{
    private boolean csomagtarto;
    public Motor(int loero, int vegsebesseg, String szin, boolean csomagtarto) {
        super(loero, vegsebesseg, szin);
        this.csomagtarto = csomagtarto;

    }

    @Override
    public String toString() {
        return "Motor{" +
                "csomagtarto=" + csomagtarto +
                ", loero=" + loero +
                ", vegsebesseg=" + vegsebesseg +
                ", szin='" + szin + '\'' +
                '}';
    }
}
