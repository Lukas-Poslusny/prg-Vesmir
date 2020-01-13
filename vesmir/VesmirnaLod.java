public class VesmirnaLod {
    public String nazev;
    public int rychlost;
    public int dolet;

    public VesmirnaLod(String nazev, int rychlost, int dolet) {
        this.nazev = nazev;
        this.rychlost = rychlost;
        this.dolet = dolet;
    }

    public void outVesmirnaLod() {
        System.out.println("Nazev: " + nazev);
        System.out.println("Rychlost: " + rychlost);
        System.out.println("Dolet: " + dolet);
    }

    public void outFlightTime(int vzdalenostOdZeme) {
        if (vzdalenostOdZeme < dolet) {
            System.out.println("lod doleti za " + vzdalenostOdZeme/rychlost/24 + " dni");
        }
        else
            System.out.println("Lod nikdy nedoleti, dojde ji palivo.");
    }

    public void outIsInRange(int vzdalenostOdZeme) {
        if (vzdalenostOdZeme > dolet){
            System.out.println("Doleti");
        }
    }
}
