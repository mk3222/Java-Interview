import java.time.Month;

public class LocalDate {
    public static void main(String[] args) {
        java.time.LocalDate date = java.time.LocalDate.of(2018, Month.APRIL, 4);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    }
}
