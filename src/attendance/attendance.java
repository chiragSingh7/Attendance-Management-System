package attendance;
import java.util.Scanner;

public abstract class attendance {
    protected int presentDays;
    protected int absentDays;
    protected int totalDays = -1;

    Scanner scanner = new Scanner(System.in);

    protected void setDays(){
        System.out.println("Enter the total number of working days : ");
        this.totalDays = scanner.nextInt();
        scanner.close();
    }

    public abstract void markAttendance();
}
