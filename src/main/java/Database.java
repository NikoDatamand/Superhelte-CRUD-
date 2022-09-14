import java.lang.reflect.Array;
import java.util.*;

public class Database {
    private ArrayList<Superhero> database = new ArrayList();

    public void addSuperhero(String superhelteNavn, String rigtigeNavn, String superkraft, String svaghed, boolean race, double højde, int skabelsesår) {
        Superhero superhero = new Superhero(superhelteNavn, rigtigeNavn, superkraft, svaghed, race, højde, skabelsesår);
        database.add(superhero);
    }

    public String getArrayList (int x) {
       for (int i = 0; i < x; i++) {
            System.out.println(database.get(i));
        }
        return " ";
    }

    public String searchSuperhero (String x) {
        boolean fundet = false;
        for (Superhero y : database) {
            if (y.getSuperhelteNavn().equals(x)) {
                System.out.println(y);
                fundet = true;
            }
        } if (!fundet) {
            System.out.println("En superhelt med det navn kunne ikke findes i databasen.");
        }
        return " ";
    }

}
