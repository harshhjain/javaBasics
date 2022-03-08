import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeForamtter{

    public static void main(String []args){

        LocalDate today = LocalDate.now();
        System.out.println(today);

        DateTimeFormatter usDateFormat = DateTimeFormatter.ofPattern("dd-MMM-YYYY");
        System.out.println(today.format(usDateFormat));

    }
}