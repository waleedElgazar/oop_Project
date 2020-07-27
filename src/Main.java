import java.util.Scanner;

public class Main {

    enum WeekDays {Sunday, Monday, Tuesday, Thursday, Friday, Saturday;}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WeekDays Day;
        Day=WeekDays.Monday;
        System.out.println(Day.toString());
    }
}
