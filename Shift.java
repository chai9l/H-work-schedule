import java.util.Objects;

public class Shift {
    String type = "";
    Worker[] customers = new Worker[4];
    Worker[] deliveries = new Worker[2];
    boolean filled = false;

    public Shift(String type) {
        if (Objects.equals(type, "Morning")) {
            customers = new Worker[4];
            deliveries = new Worker[2];
        }
        else if (Objects.equals(type, "Evening")) {
            customers = new Worker[5];
            deliveries = new Worker[2];
        }
        else if (Objects.equals(type, "Friday Morning")) {
            customers = new Worker[5];
            deliveries = new Worker[2];
        }
    }
}
