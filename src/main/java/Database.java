import java.lang.reflect.Array;
import java.util.*;

public class Database {
    private ArrayList<Superhero> database = new ArrayList();

    public void addSuperhero(String superhelteNavn, String rigtigeNavn, String superkraft, String svaghed, boolean race, double højde, int skabelsesår) {
        Superhero superhero = new Superhero(superhelteNavn, rigtigeNavn, superkraft, svaghed, race, højde, skabelsesår);
        database.add(superhero);
    }

    public Superhero getArrayList (int x) {
        return database.get(x);
    }

}
