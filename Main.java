package data;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(0);
        date1.addYears(0);
        System.out.println("дата 1:");
        System.out.println(date1.format("dd.MM.yyyy"));

        Date date2 = Date.parseString("28.02.2020", "dd.MM.yyyy");
        date2.addDays(1);
        date2.addYears(2);
        System.out.println("дата 2:");
        System.out.println(date2.format("dd.MM.yyyy"));

        Date date3 = Date.parseString("10.09.2022", "dd.MM.yyyy");
        date3.addMonths(5);
        System.out.println("дата 3:");
        System.out.println(date3.format("dd.MM.yyyy"));

        int comparison1 = date1.compare(date2);
        if (comparison1 < 0) {
            System.out.println("Дата 1 раньше даты 2");
        } else if (comparison1 > 0) {
            System.out.println("Дата 1 позже даты 2");
        } else {
            System.out.println("Дата 1 и дата 2 равны");
        }

        int comparison2 = date2.compare(date3);
        if(comparison2 < 0) {
            System.out.println("дата 2 раньше даты 3");
        } else if (comparison2 > 0) {
        System.out.println("Дата 2 позже даты 3");
            } else {
                System.out.println("Дата 2 и дата 3 равны");
        }
    }
}
