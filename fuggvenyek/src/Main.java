import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
            String sz1 = "alma";
            String sz2 = "alma";
        //nem helyes
        if (sz1 == sz2) {
            System.out.println("Egyenlőek");
        }
        //helyes
        if (sz1.equals(sz2)) {
            System.out.println("egyenlőek");
        }

         */
        /*
        LocalDate date = LocalDate.now();
        date = date.plusDays(2);
        System.out.println(date.getDayOfYear());

        LocalDate date2 = LocalDate.now();
        date2 = date2.plusWeeks(2);
        System.out.println("date2 = " + date2);

        LocalTime time = LocalTime.now();
        time = time.plusHours(5);
        System.out.println("time = " + time.getHour());

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("dt = " + dt.getHour());
         */
        int lastSecond = 0;
        while(true){
            LocalTime time = LocalTime.now();
            if (lastSecond != time.getSecond()) {
                System.out.println("time = " + time);
                lastSecond = time.getSecond();
            }

        }

    }
}
