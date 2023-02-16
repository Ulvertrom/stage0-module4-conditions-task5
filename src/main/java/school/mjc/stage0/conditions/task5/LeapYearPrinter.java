package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int remainder = year % 4;
        switch (remainder) {
            case 1:
            case 2:
            case 3:
                System.out.println("not leap");
                break;
            case 4:
                if ((year % 100) != 0) {
                    System.out.println("leap");
                }
                else {
                    System.out.println((year % 400 == 0) ? "leap": "not leap");
                }
        }
    }
}
