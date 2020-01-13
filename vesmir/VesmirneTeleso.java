public class VesmirneTeleso {
    public String nazev;
    public int teplotaPovrchu;
    public double gravitace;
    public long vzdalenostOdZeme;

	public VesmirneTeleso(String nazev, int teplotaPovrchu, double gravitace, long vzdalenostOdZeme) {
       this.nazev = nazev;
       this.teplotaPovrchu = teplotaPovrchu;
       this.gravitace = gravitace;
       this.vzdalenostOdZeme = vzdalenostOdZeme;
	}

	public void outVesmirneTeleso() {
        System.out.println("Nazev: " + nazev);
        System.out.println("Teplota povrchu: " + teplotaPovrchu);
        System.out.println("Vzdalenost od zeme: " + vzdalenostOdZeme);
        System.out.println("Gravitace na planete: " + gravitace);
    }

    public void outHmotnostNaPlanete(int vahaZeme) {
        System.out.println("Vaha na planete " + nazev + " je: " + vahaZeme*gravitace + "kg. " + gravitace + "x zeme.");
    }
}
