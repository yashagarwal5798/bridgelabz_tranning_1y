package Static_in_Method_Interface.Problem_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public interface DateUtils
{
    static String formatDate(LocalDate date)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(formatter);
    }
}
