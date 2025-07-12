package attendance;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Attendance implements attendanceMethods{
    protected List<LocalDate> presentDays;
    protected List<LocalDate> absentDays;
    protected int totalDays;

    Scanner scanner = new Scanner(System.in);

    protected void setDays(){
        System.out.println("Enter the total number of working days : ");
        this.totalDays = scanner.nextInt();
        scanner.close();
    }

    public void markPresent(LocalDate date){

    }

    public void markAbsent(LocalDate date){

    }

    public List<LocalDate> viewPresentDates(){

        return this.absentDays;
    }

    public List<LocalDate> viewAbsentDates(){

        return this.presentDays;
    }

}
