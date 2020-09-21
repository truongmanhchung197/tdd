public class NextDayCalculator {
    public static final int FIRSTOFMONTH = 1;
    public static int LASTOFMONTH = 31;

    public static String findNextDay(int dayTest, int monthTest, int yearYest) {
        switch (monthTest) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dayTest < LASTOFMONTH) {
                    dayTest++;
                } else if (monthTest != 12) {
                    dayTest = FIRSTOFMONTH;
                    monthTest++;
                } else {
                    dayTest = FIRSTOFMONTH;
                    monthTest = 1;
                    yearYest++;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                LASTOFMONTH = 30;
                if (dayTest < LASTOFMONTH) {
                    dayTest++;
                } else {
                    dayTest = FIRSTOFMONTH;
                    monthTest++;
                }
                break;
            case 2:
                if (checkLeapYear(yearYest)) {
                    LASTOFMONTH = 29;
                    if (dayTest < LASTOFMONTH) {
                        dayTest++;
                    } else {
                        dayTest = 1;
                        monthTest++;
                    }
                } else {
                    LASTOFMONTH = 28;
                    if (dayTest < LASTOFMONTH) {
                        dayTest++;
                    } else {
                        dayTest = FIRSTOFMONTH;
                        monthTest++;
                    }
                }
                break;
        }
        return dayTest + "/" + monthTest + "/" + yearYest;
    }

    public static boolean checkLeapYear(int year) {
        boolean divisibleBy4 = year % 4 == 0;
        if (divisibleBy4) {
            boolean divisibleBy100 = year % 100 == 0;
            if (divisibleBy100) {
                boolean divisibleBy400 = year % 400 == 0;
                if (divisibleBy400) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
