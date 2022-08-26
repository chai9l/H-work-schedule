import java.util.Objects;

public class Day {
    String day = "";
    boolean week_day = true;
    Shift[] shifts = new Shift[2]; // 0 = Morning, 1 = Evening

    public Day(String day) {
        if (Objects.equals(day, "Friday")) {
            week_day = false;
            shifts[0] = new Shift("Friday Morning");
        }
        else {
            shifts[0] = new Shift("Morning");
        }
        shifts[1] = new Shift("Evening");
    }
}
