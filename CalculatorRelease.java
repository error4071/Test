import java.util.Scanner;

public class CalculatorRelease {
    public static void main(String[] arguments) {

        Scanner first = new Scanner(System.in);
        Scanner second = new Scanner(System.in);

        System.out.println();
        System.out.println("Пожалуйста, выберите нужную опцию:");
        System.out.println();
        System.out.println("1 - сложение");
        System.out.println("2 - вычитание");
        System.out.println("3 - умножение.");
        System.out.println("4 - деление.");

        int command = first.nextInt();

        while (true) {


            if (command == 1) {

                System.out.println(" Введите первое число: ");
                double a = first.nextDouble();

                System.out.println("Введите второе число: ");
                double b = second.nextDouble();

                System.out.println("Решение: ");
                System.out.println(a + b);
            }
            if (command == 2) {
                System.out.println(" Введите первое число: ");
                double a = first.nextInt();

                System.out.println("Введите второе число: ");
                double b = second.nextDouble();

                System.out.println("Решение: ");
                System.out.println(a - b);
            }
            if (command == 3) {
                System.out.println(" Введите первое число: ");
                double a = first.nextDouble();

                System.out.println("Введите второе число: ");
                double b = second.nextDouble();

                System.out.println("Решение: ");
                System.out.println(a * b);
            }
            if (command == 4) {
                System.out.println(" Введите первое число: ");
                double a = first.nextDouble();

                System.out.println("Введите второе число: ");
                double b = second.nextDouble();

                System.out.println("Решение: ");
                System.out.println(a / b);
            }
        break;
        }
    }
}
