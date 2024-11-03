import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ПОНЕДЕЛЬНИК ВТОРНИК СРЕДА ЧЕТВЕРГ ПЯТНИЦА СУББОТА ВОСКРЕСЕНЬЕ:");
        String input = scanner.nextLine().trim().toUpperCase();
        if (input.equals("ПОНЕДЕЛЬНИК")) {
            System.out.println(Day.MONDAY.getLesson());
        } else if (input.equals("ВТОРНИК")) {
            System.out.println(Day.TUESDAY.getLesson());
        } else if (input.equals("СРЕДА")) {
            System.out.println(Day.WEDNESDAY.getLesson());
        } else if (input.equals("ЧЕТВЕРГ")) {
            System.out.println(Day.THURSDAY.getLesson());
        } else if (input.equals("ПЯТНИЦА")) {
            System.out.println(Day.FRIDAY.getLesson());
        } else if (input.equals("СУББОТА")) {
            System.out.println(Day.SATURDAY.getLesson());
        } else if (input.equals("ВОСКРЕСЕНЬЕ")) {
            System.out.println(Day.SUNDAY.getLesson());
        } else {
            System.out.println("Пожалуйста, введите корректный день недели.");
        }
    }
}