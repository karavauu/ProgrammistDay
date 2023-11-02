import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа определяет точную дату дня программиста в заданном году");
        System.out.print("Введите год в котором вы хотите узнать точную дату дня программиста : 1");
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println("День программиста в этом году приходится на дату 12/09/" + year);
        else
            System.out.println("День программиста в этом году приходится на дату 13/09/" + year);
    }
}