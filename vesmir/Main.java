import java.util.Scanner;

class Main {

    static int vzdalenostOdZeme1;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vyber planetu: (Mars/Venuse/Jupiter/Saturn/Neptun)");
        String planeta = sc.nextLine();

        System.out.println("Zadej svou hmotnost na zemi: ");
        int vahaZeme = sc.nextInt();

        System.out.println("Vyber si svou hvezdnou lod: (Alpha/Beta/Gama)");
        String lod = sc.nextLine();

        // Nazev, teplota, gravitace, vzdalenost od zeme
        VesmirneTeleso Mars = new VesmirneTeleso("Mars", -63, 0.376, 54600000);
        VesmirneTeleso Venuse = new VesmirneTeleso("Venuse", -45, 0.904, 41000000);
        VesmirneTeleso Jupiter = new VesmirneTeleso("Jupiter", -121, 2.358, 650000000);
        VesmirneTeleso Saturn = new VesmirneTeleso("Saturn", 93, 0.914, 1426900000);
        VesmirneTeleso Neptun = new VesmirneTeleso("Neptun", 53, 1.14, 430800000);

        // Nazev, rychlost, dolet
        VesmirnaLod Alpha = new VesmirnaLod("Alpha", 50000, 200000000);
        VesmirnaLod Beta = new VesmirnaLod("Beta", 1500000, 50000000);
        VesmirnaLod Gama = new VesmirnaLod("Gama", 100000, 75000000);

        switch (planeta) {
        case "Mars":
            Mars.outVesmirneTeleso();
            Mars.outHmotnostNaPlanete(vahaZeme);
            Mars.vzdalenostOdZeme = vzdalenostOdZeme1;
            break;
        case "Venuse":
            Venuse.outVesmirneTeleso();
            Venuse.outHmotnostNaPlanete(vahaZeme);
            Venuse.vzdalenostOdZeme = vzdalenostOdZeme1;
            break;
        case "Jupiter":
            Jupiter.outVesmirneTeleso();
            Jupiter.outHmotnostNaPlanete(vahaZeme);
            Jupiter.vzdalenostOdZeme = vzdalenostOdZeme1;
            break;
        case "Saturn":
            Saturn.outVesmirneTeleso();
            Saturn.outHmotnostNaPlanete(vahaZeme);
            Saturn.vzdalenostOdZeme = vzdalenostOdZeme1;
            break;
        case "Neptun":
            Neptun.outVesmirneTeleso();
            Neptun.outHmotnostNaPlanete(vahaZeme);
            Neptun.vzdalenostOdZeme = vzdalenostOdZeme1;
            break;
        default:
            System.out.println("Spatne zadano jmeno planety");
            break;
        }

        switch (lod) {
        case "Alpha":
            Alpha.outVesmirnaLod();
            Alpha.outFlightTime(vzdalenostOdZeme1);
            Alpha.outIsInRange(vzdalenostOdZeme1);
            break;
        case "Beta":
            Beta.outVesmirnaLod();
            Beta.outFlightTime(vzdalenostOdZeme1);
            Beta.outIsInRange(vzdalenostOdZeme1);
            break;
        case "Gama":
            Gama.outVesmirnaLod();
            Gama.outFlightTime(vzdalenostOdZeme1);
            Gama.outIsInRange(vzdalenostOdZeme1);
            break;
        default:
            System.out.println("Spatne zadane jmone lode.");
            break;
        }
    }
}