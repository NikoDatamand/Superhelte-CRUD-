import java.util.*;

public class Main {

    public static void main(String[] args) {
        int antalSuperhelte = 0;
        Scanner sc = new Scanner(System.in);
        Database superhelteDatabase = new Database();

        int valg = 0;
        do {
            System.out.println("""
                    Velkommen til denne superhelte database! 
                    Hvad ønsker du at foretage dig?
                    1. Opret superhelt
                    2. Se alle superhelte
                    3. Find superhelt
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
                boolean race = sc.nextBoolean();
                System.out.println("Hvor høj er superhelten?");
                double højde = sc.nextDouble();
                System.out.println("Hvornår blev superhelten skabt?");
                int skabelsesår = sc.nextInt();

                superhelteDatabase.addSuperhero(superhelteNavn, rigtigeNavn, superkraft, svaghed, race, højde, skabelsesår);
                System.out.println("Tak! Din superhelt er nu registreret.");
                antalSuperhelte++;
            } else if (valg == 2) {
                System.out.println(superhelteDatabase.getArrayList(antalSuperhelte));
            } else if (valg == 3) {
                System.out.println("Hvad hedder superhelten du leder efter?");
                String findSuperhelt = sc.nextLine();
                System.out.println(superhelteDatabase.searchSuperhero(findSuperhelt));
            }
            else {
                System.exit(0);
                System.out.println(" ");
            }
        } while (valg != 9);
    }

}
