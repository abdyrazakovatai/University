public class University {
    private String name;
    private String prof;
    private String adrees;

    public University(String name, String prof, String adrees) {
        this.name = name;
        this.prof = prof;
        this.adrees = adrees;
    }

    public University() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getAdrees() {
        return adrees;
    }

    public void setAdrees(String adrees) {
        this.adrees = adrees;
    }

    public String getInfo() {
        return String.format("""
                Univeersity
                name: %s
                proffesia: %s
                adress: %s
                """, name, prof, adrees);
    }
}
