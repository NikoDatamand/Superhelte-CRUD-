import java.util.*;

public class Userinterface {

    private int antalSuperhelte = 0;
    private int valg = 0;
    private Scanner sc = new Scanner(System.in);
    private Database superhelteDatabase = new Database();

    public String toString() {
        do {
            System.out.println(" ");
            System.out.println("""
                    Velkommen til denne superhelte database! 
                    Hvad ønsker du at foretage dig?
                    1. Opret superhelt
                    2. Se alle superhelte
                    3. Find superhelt
                    4. Rediger superhelt
                    9. Afslut
                    """);
            valg = sc.nextInt();
            sc.nextLine();
            if (valg == 1) {
                System.out.println("Hvad er navnet på superhelten du vil oprette?");
                String superhelteNavn = sc.nextLine();
                System.out.println("Hvad er superheltens rigtige navn?");
                String rigtigeNavn = sc.nextLine();
                System.out.println("Hvad er superheltens særlige superkraft(er)?");
                String superkraft = sc.nextLine();
                System.out.println("Har superhelten en svaghed eller flere? Hvilke(n)?");
                String svaghed = sc.nextLine();
                System.out.println("Er superhelten et menneske?");
                String race = sc.nextLine();
                boolean raceRaw = true;
                if (race.equalsIgnoreCase("ja")) {
                    raceRaw = true;
                } else if (race.equalsIgnoreCase("nej")) {
                    raceRaw = false;
                }
                System.out.println("Hvor høj er superhelten?");
                double højde = readDouble();
                System.out.println("Hvornår blev superhelten skabt?");
                int skabelsesår = readInteger();

                /* boolean x = false;
                while (x == false) {
                try {
                    skabelsesår = readNumber();
                    checkInt(skabelsesår);
                    x = true;
                } catch (IllegalArgumentException e) {
                    System.out.println("Du skal indtaste et tal højere end 0");
                }
                } */

                superhelteDatabase.addSuperhero(superhelteNavn, rigtigeNavn, superkraft, svaghed, raceRaw, højde, skabelsesår);
                System.out.println(" ");
                System.out.println("Tak! Din superhelt er nu registreret.");
                antalSuperhelte++;
            } else if (valg == 2) {
                System.out.println(" ");
                System.out.println(superhelteDatabase.getArrayList(antalSuperhelte));
            } else if (valg == 3) {
                System.out.println("Hvad hedder superhelten du leder efter?");
                String findSuperhelt = sc.nextLine();
                System.out.println(" ");
                System.out.println(superhelteDatabase.searchSuperhero(findSuperhelt));
            } else if (valg == 4) {
                System.out.println("Hvad hedder superhelten du vil redigere?");
                String redigerFindSuperhelt = sc.nextLine();
                String findesSuperhelten = superhelteDatabase.searchSuperhero(redigerFindSuperhelt);
                if (superhelteDatabase.getReturnMessage(findesSuperhelten) == " ") {
                    System.out.println(" ");
                    System.out.println("Indtast det ønskede superheltenavn");
                    String redigerSuperhelteNavn = sc.nextLine();
                    System.out.println("Indtast det ønskede rigtige navn på superhelten");
                    String redigerRigtigeNavn = sc.nextLine();
                    System.out.println("Indtast superkraften/superkrafterne som superhelten skal have");
                    String redigerSuperkraft = sc.nextLine();
                    System.out.println("Indtast superheltens svaghed(er)");
                    String redigerSvaghed = sc.nextLine();
                    System.out.println("Er superhelten et menneske?");
                    String redigerRace = sc.nextLine();
                    boolean redigerRaceRaw = true;
                    if (redigerRace.equalsIgnoreCase("ja")) {
                        redigerRaceRaw = true;
                    } else if (redigerRace.equalsIgnoreCase("nej")) {
                        redigerRaceRaw = false;
                    }
                    System.out.println("Indtast superheltens højde");
                    double redigerHøjde = readDouble();
                    System.out.println("Indtast skabelsesåret for superhelten");
                    int redigerSkabelsesår = readInteger();
                    System.out.println(" ");
                    superhelteDatabase.setSuperhero(redigerFindSuperhelt, redigerSuperhelteNavn, redigerRigtigeNavn, redigerSuperkraft, redigerSvaghed, redigerRaceRaw, redigerHøjde, redigerSkabelsesår);
                    System.out.println("Superheltens informationer er nu opdateret!");
                    System.out.println(" ");
                } else if (superhelteDatabase.getReturnMessage(redigerFindSuperhelt) == "En superhelt med det navn kunne ikke findes i databasen."){
                    System.out.println("En superhelt med det navn kunne ikke findes i databasen.");
                }

            }
            else if (valg != 9) {
                System.out.println("Dette tal har ingen funktion, prøv igen!");
            }
        } while (valg != 9);
        return " ";
    }

    public int readInteger () {
        while (!sc.hasNextInt()) {
            String text = sc.nextLine();
            System.out.println("Du skal skrive et heltal!");
        }
        return sc.nextInt();
    }

    public double readDouble () {
        while (!sc.hasNextDouble()) {
            String text = sc.nextLine();
            System.out.println("Du skal skrive et kommatal!");
        }
        return sc.nextDouble();
    }

    /* public void checkInt (int skabelsesår) {
        if (skabelsesår < 0) {
            throw new IllegalArgumentException("Vade retro, Satana!");
        }
    } */
}
