import java.util.GregorianCalendar;

public class CalendarExample {
    public static void main(String[] args) {
        // Задача 1: Отображение текущего года, месяца и дня
        GregorianCalendar calendar = new GregorianCalendar();

        int currentYear = calendar.get(GregorianCalendar.YEAR);
        int currentMonth = calendar.get(GregorianCalendar.MONTH) + 1;
        int currentDay = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Текущая дата: " + currentDay + "." + currentMonth + "." + currentYear);

        // Задача 2: Установить время в миллисекундах с помощью setTimeInMillis
        calendar.setTimeInMillis(1234567898765L);

        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1;
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Дата для 1234567898765L: " + day + "." + month + "." + year);
    }
}