import java.util.Scanner;
public class Worker {
    private String name;
    private String type; //  D = Delieveries, C = Customers
    private int dependable; // 1 = worker is dependable, 0 = worker is shite
    private boolean sat_hours = false;
    public int[][] shifts_wanted = new int[7][2];
    //** Notice that row represents morning or evening shifts,
    // and columns represents the day in the week **//

    public Worker(String name,String type, int dependable) {
        this.name = name;
        Scanner buffer = new Scanner(System.in);
        while(type != "D" || type != "C") {
            System.out.println("Type must be either D - for Delieveries or C - for Customers");
            type = buffer.nextLine();
        }
        if (type == "D") {
            this.type = "Delivery";
        }
        else if (type == "C") {
            this.type = "Customers";
        }
        while (dependable != 1 || dependable != 0) {
            System.out.println("Please enter dependancy with value of either 0 for a shit worker or 1 for a noice worker");
            dependable = buffer.nextInt();
        }
        this.dependable = dependable;
    }

    void insert_shifts() {
        Scanner buffer = new Scanner(System.in);
        boolean done = false;
        System.out.println("Please enter " +this.name+ " wanted shifts:");
        System.out.println("Type 1 if a shift is wanted and 0 otherwise");
        System.out.println("----- Week Number 1 -----");
        for (int i = 0; i < 7; i++) {
            System.out.println("Enter ")
        }
    }
}
