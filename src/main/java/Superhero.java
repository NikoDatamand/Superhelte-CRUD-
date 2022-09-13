public class Superhero {
    //Attributes
    private String superhelteNavn;
    private String rigtigeNavn;
    private String superkraft;
    private String svaghed;
    private boolean race;
    private double højde;
    private int skabelsesår;

    //Constructor
    public Superhero(String superhelteNavn, String rigtigeNavn, String superkraft, String svaghed, boolean race, double højde, int skabelsesår) {
        this.superhelteNavn = superhelteNavn;
        this.rigtigeNavn = rigtigeNavn;
        this.superkraft = superkraft;
        this.svaghed = svaghed;
        this.race = race;
        this.højde = højde;
        this.skabelsesår = skabelsesår;
    }

    //GET
    public String getSuperhelteNavn() {
        return superhelteNavn;
    }
    public String getRigtigeNavn() {
        return rigtigeNavn;
    }
    public String getSuperkraft() {
        return superkraft;
    }
    public String getSvaghed() {
        return svaghed;
    }
    public boolean getRace() {
        return race;
    }
    public double getHøjde() {
        return højde;
    }
    public int getSkabelsesår() {
        return skabelsesår;
    }

    //SET
    public void setSuperhelteNavn(String newSuperhelteNavn) {
        this.superhelteNavn = newSuperhelteNavn;
    }
    public void setRigtigeNavn(String newRigtigeNavn) {
        this.rigtigeNavn = newRigtigeNavn;
    }
    public void setSuperkraft(String newSuperkraft) {
        this.superkraft = newSuperkraft;
    }
    public void setSvaghed(String newSvaghed) {
        this.svaghed = newSvaghed;
    }
    public void setRace(boolean newRace) {
        this.race = newRace;
    }
    public void setHøjde(double newHøjde) {
        this.højde = newHøjde;
    }
    public void setSkabelsesår(int newSkabelsesår) {
        this.skabelsesår = newSkabelsesår;
    }

    public String toString() {
        return superhelteNavn + " " + rigtigeNavn + " " + superkraft + " " + svaghed + " " + race + " " + højde + " " + skabelsesår;
    }
}
