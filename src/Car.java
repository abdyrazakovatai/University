import java.time.LocalDate;

public class Car {
    private String brand;
    private String model;
    private int issue;
    private long volume;


    public Car() {
    }

    public Car(String brand, String model, int issue, long volume) {
        this.brand = brand;
        this.model = model;
        this.issue = issue;
        this.volume = volume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public String getInfo() {
        return String.format("""
                Car
                brand: %s
                model: %s
                issua: %d
                volume: %s""", brand, model, issue, volume);
    }
}
