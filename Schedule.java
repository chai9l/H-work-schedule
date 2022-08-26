

public class Schedule {
    Week[] weeks = new Week[2];

    public Schedule() {
        for (int i = 0; i < 2; i++) {
            weeks[i] = new Week();
        }
    }
}
