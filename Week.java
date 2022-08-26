
public class Week {
    Day[] days = new Day[7]; // ignoring 0

    public Week() {
        days[0] = new Day("Sunday");
        days[1] = new Day("Monday");
        days[2] = new Day("Tuesday");
        days[3] = new Day("Wednesday");
        days[4] = new Day("Thursday");
        days[5] = new Day("Friday");
        days[6] = new Day("Saturday");
    }
}
