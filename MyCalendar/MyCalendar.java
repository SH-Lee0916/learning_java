package MyCalendar;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class MyCalendar {
    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30 ,31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30 ,31, 30, 31};
    private static final String[] MONTH = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
    private static final String[] MON_NAME = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static HashMap<String, ArrayList<String>> schedule = new HashMap<String, ArrayList<String>>();
    // private static final String[] DAYS = {"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};


    private boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? true : false;
    }


    private int getMaxDate(int year, int mon) {
        return isLeapYear(year) ? LEAP_MAX_DAYS[mon - 1] : MAX_DAYS[mon - 1];
    }


    private int startDay(int year, int mon) {
        int preYear = year - 1;
        int numOfDays = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);
        for (int i = 0; i < mon - 1; i++) {
            numOfDays += isLeapYear(year) ? LEAP_MAX_DAYS[i] : MAX_DAYS[i];
        }
        return (numOfDays + 1) % 7;
    }


    private ArrayList<Integer> currentYearMon() {
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        SimpleDateFormat monthFormat = new SimpleDateFormat("MM");

        ArrayList<Integer> yearMon = new ArrayList<Integer>();
        yearMon.add(Integer.parseInt(yearFormat.format(System.currentTimeMillis())));
        yearMon.add(Integer.parseInt(monthFormat.format(System.currentTimeMillis())));

        return yearMon;
    }


    public void setSchedule(String date, String contents) {
        if (schedule.containsKey(date)) {
            schedule.get(date).add(contents);
        } else {
            ArrayList<String> tmp_cont = new ArrayList<String>();
            tmp_cont.add(contents);
            schedule.put(date, tmp_cont);
        }
    }


    public void searchSchedule(String date) {
        if (schedule.containsKey(date)) {
            System.out.println(date + "'s Schedule");
            ArrayList<String> tmp = schedule.get(date);
            for (int i = 0; i < tmp.size(); i++) {
                System.out.println((i + 1) + ": " + tmp.get(i));
            }
        } else {
            System.out.println("Date: " + date + ", there is no schedule");
        }
        System.out.println();
    }


    public void editSchedule(String date, String contents, int idx) {
        if (schedule.containsKey(date)) {
            schedule.get(date).set(idx - 1, contents);
        } else {
            setSchedule(date, contents);
        }
    }


    public void printCalendar(int year, int mon) {
        System.out.printf("     <<%4d Year %s>>\n", year, MON_NAME[mon - 1]);
        System.out.println("Sun Mon Tue Wed Thur Fri Sat");
        System.out.println("----------------------------");

        int max_day = getMaxDate(year, mon);
        int start_day = startDay(year, mon);

        for (int i = 1; i < max_day + 1 + start_day; i++) {

            if (i < start_day + 1) {
                System.out.print("    ");
            } else {
                String tmp = "";
                tmp += Integer.toString(year) + "-";
                tmp += MONTH[mon - 1] + "-";
                tmp += Integer.toString(i - start_day);

                if (schedule.containsKey(tmp))
                    System.out.printf("%3d.", i - start_day);
                else 
                    System.out.printf("%3d ", i - start_day);

                if (i % 7 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.printf("\n\n");
    }


    public static void main(String[] args) {
        MyCalendar cal = new MyCalendar();

        ArrayList<Integer> curYearMon = cal.currentYearMon();
        cal.printCalendar(curYearMon.get(0), curYearMon.get(1));
        cal.setSchedule("2022-06-27", "Java study");
        cal.searchSchedule("2022-06-27");
        cal.setSchedule("2022-06-27", "Eat dinner");
        cal.searchSchedule("2022-06-27");
        cal.editSchedule("2022-06-27", "Eat samgeopsal", 2);
        cal.searchSchedule("2022-06-27");
        cal.editSchedule("2022-06-28", "Work....", 1);
        cal.searchSchedule("2022-06-28");
        cal.printCalendar(curYearMon.get(0), curYearMon.get(1));
        System.out.println(); 
    }
}
