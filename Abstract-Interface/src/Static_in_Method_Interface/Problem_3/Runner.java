package Static_in_Method_Interface.Problem_3;
import java.time.LocalDate;
public class Runner
{
    public static void main(String[] args)
    {
        LocalDate today = LocalDate.now();
        String formattedDate = DateUtils.formatDate(today);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
