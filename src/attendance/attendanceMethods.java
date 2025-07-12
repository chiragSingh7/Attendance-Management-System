package attendance;

import java.time.LocalDate;
import java.util.List;

public interface attendanceMethods {

    public List<LocalDate> viewPresentDates();

    public List<LocalDate> viewAbsentDates();

    public void markPresent(LocalDate date);

    public void markAbsent(LocalDate date);


}
