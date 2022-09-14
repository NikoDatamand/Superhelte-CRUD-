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

}
