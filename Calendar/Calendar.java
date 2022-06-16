package Calendar;

public class Calendar {
    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30 ,31, 30, 31}; 

    public int getMaxDate(int mon) {
        return MAX_DAYS[mon - 1];
    }

    public void printCalendar(int mon) {
        System.out.println("Sun Mon Tue Wed Thur Fri Sat");
        System.out.println("----------------------------");
        int max_day = getMaxDate(mon);

        for (int i = 1; i < max_day + 1; i++) {
            System.out.printf("%3d ", i);
            if (i % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Calendar cal = new Calendar();

        cal.printCalendar(1);
        System.out.println(); 
    }
}
