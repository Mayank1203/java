package DateTime;

import java.time.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateTimeClass {
    

    public static void main(String[] args) {
        // LocalDate lt = LocalDate.now();
        // System.out.println(lt);

        // int year = lt.getYear();
        // int mon = lt.getMonthValue();
        // int day = lt.getDayOfMonth();

        // System.out.println(day +"/" + mon + "/" + year );

        // LocalTime ld= LocalTime.now();
        // System.out.println(ld);
        // int hour = ld.getHour();
        // int min = ld.getMinute();
        // int sec = ld.getSecond();

        // System.out.println(hour + "/" + min + "/" + sec );

        // LocalDate date = LocalDate.now();
                    // System.out.println(date);
                    // LocalTime time=LocalTime.now();
                    // System.out.println(time);

                    LocalDate date = LocalDate.of(2024, 5, 3);
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                    String formattedDate = date.format(formatter);
                    System.out.println("Formatted Date: " + formattedDate);

    }
}
