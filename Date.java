package data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {

    private int daysSinceStartDate;

    public Date(int daysSinceStartDate) {
        LocalDate startDate = LocalDate.of(1, 1, 1); // Устанавливаем дату 01.01.0001
        this.daysSinceStartDate = (int) startDate.toEpochDay();
    }



    public static Date parseString(String dateString, String pattern) {
        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern(pattern));
        return new Date((int) date.toEpochDay());
    }

    public void addDays(int days) {
        daysSinceStartDate += days;
    }

    public void addMonths(int months) {
        LocalDate date = LocalDate.ofEpochDay(daysSinceStartDate);
        date = date.plusMonths(months);
        daysSinceStartDate = (int) date.toEpochDay();
    }

    public void addYears(int years) {
        LocalDate date = LocalDate.ofEpochDay(daysSinceStartDate);
        date = date.plusYears(years);
        daysSinceStartDate = (int) date.toEpochDay();
    }

    public int compare(Date other) {
        return Integer.compare(this.daysSinceStartDate, other.daysSinceStartDate);
    }

    public String format(String pattern) {
        LocalDate date = LocalDate.ofEpochDay(daysSinceStartDate);
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }

}

