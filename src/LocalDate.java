void main() {
    java.time.LocalDate date = java.time.LocalDate.of(2018, Month.APRIL, 4);
    IO.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
}
