package task3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(1993, 04, 30);
        Date date = calendar.getTime();
        inputTime(date);

    }
    public static void inputTime (Date outputTime) {
        Date currentDate = new Date();
        Long interval = currentDate.getTime() - outputTime.getTime();

        long msecPerMinute = 60000L;
        long msecPerHour = 3600000L;
        long msecPerDay = 86400000L;
        long msecPerWeek = 604800000L;
        long msecPerMonth = 2592000000L;
        long msecPerYear = 31536000000L;

        int years = (int)(interval / msecPerYear);
        interval = interval - (years - msecPerYear);
        int mounts = (int)Math.floor(interval / msecPerMonth);
        interval = interval - (mounts / msecPerMonth);
        int weeks = (int)Math.floor(interval / msecPerWeek);
        interval = interval - (weeks * msecPerWeek);
        int days = (int)Math.floor(interval / msecPerDay);
        interval = interval - (days * msecPerDay);
        int hours = (int)Math.floor(interval / msecPerHour);
        interval = interval - (hours * msecPerHour);
        int minutes = (int)Math.floor(interval / msecPerMinute);
        interval = interval - (minutes * msecPerMinute);
        int second = (int)Math.floor(interval / 1000);
        System.out.println(currentDate);
        System.out.println(outputTime);

        System.out.println("Прошло: " + years + " лет, " + mounts + " месяцев, " + weeks + " недель, " + days + " дней, " +
                hours + " часов, " + second + " секунд");

    }
}

