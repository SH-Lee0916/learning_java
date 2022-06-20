package Calendar;

public class Calendar {
    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30 ,31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30 ,31, 30, 31};

    private boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? true : false;
    }

    private int getMaxDate(int year, int mon) {
        return isLeapYear(year) ? LEAP_MAX_DAYS[mon - 1] : MAX_DAYS[mon - 1];
    }

    public void printCalendar(int year, int mon) {
        System.out.println("Sun Mon Tue Wed Thur Fri Sat");
        System.out.println("----------------------------");

        int max_day = getMaxDate(year, mon);

        for (int i = 1; i < max_day + 1; i++) {
            System.out.printf("%3d ", i);
            if (i % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Calendar cal = new Calendar();

        cal.printCalendar(2020, 2);
        System.out.println(); 
    }
}
