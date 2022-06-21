package Calendar;

import java.util.Arrays;

public class Calendar {
    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30 ,31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30 ,31, 30, 31};
    private static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static final String[] DAYS = {"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};

    private boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? true : false;
    }

    private int getMaxDate(int year, int mon) {
        return isLeapYear(year) ? LEAP_MAX_DAYS[mon - 1] : MAX_DAYS[mon - 1];
    }

    public void printCalendar(int year, int mon, String day) {
        System.out.printf("     <<%4d Year %s>>\n", year, MONTHS[mon - 1]);
        System.out.println("Sun Mon Tue Wed Thur Fri Sat");
        System.out.println("----------------------------");

        int max_day = getMaxDate(year, mon);
        int start_day = Arrays.asList(DAYS).indexOf(day);

        for (int i = 1; i < max_day + 1 + start_day; i++) {

            if (i < start_day + 1) {
                System.out.print("    ");
            } else {
                System.out.printf("%3d ", i - start_day);
                if (i % 7 == 0) {
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        Calendar cal = new Calendar();

        cal.printCalendar(2020, 2, "Sat");
        System.out.println(); 
    }
}
