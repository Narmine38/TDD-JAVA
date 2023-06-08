public class Task {
   private int identifiant;
   private String description;
   private boolean state;

    public Task(int identifiant, String description, boolean state) {
        this.identifiant = identifiant;
        this.description = description;
        this.state = state;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
