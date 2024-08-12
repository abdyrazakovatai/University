public class School {
    private String name;
    private int number;
    private String adress;


    public School() {

    }

    public School(String name, int number, String adress) {
        this.name = name;
        this.number = number;
        this.adress = adress;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getInfo() {
        return String.format("""
                School
                name: %s
                number: %s
                adress: %s
                """, name, number, adress);
    }
}
