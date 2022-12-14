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
        String returnMessage = " ";
        boolean fundet = false;
        for (Superhero y : database) {
            if (y.getSuperhelteNavn().contains(x)) {
                System.out.println(y);
                returnMessage = " ";
                fundet = true;
            }
        } if (!fundet) {
            returnMessage = "En superhelt med det navn kunne ikke findes i databasen.";
        }
        return returnMessage;
    }

    public int searchSuperheroDelete (String x) {
        int superheroIndex = 0;
        for (Superhero y : database) {
            if (y.getSuperhelteNavn().contains(x)) {
                 superheroIndex = database.indexOf(y);
            }
        }
        return superheroIndex;
    }

    public void setSuperhero (String x, String a, String b, String c, String d, boolean e, double f, int g) {
        for (Superhero y : database) {
            if (y.getSuperhelteNavn().contains(x)) {
                y.setSuperhelteNavn(a);
                y.setRigtigeNavn(b);
                y.setSuperkraft(c);
                y.setSvaghed(d);
                y.setRace(e);
                y.setHøjde(f);
                y.setSkabelsesår(g);
            }
        }
    }

    public void deleteSuperhero (String x) {
            //for (int i = 0; i < database.size(); i++) {
                //if () {
        database.get(searchSuperheroDelete(x));
        database.remove(searchSuperheroDelete(x));
              //  }
           // }
    }

    public String getReturnMessage (String z) {
        return z;
    }
}
