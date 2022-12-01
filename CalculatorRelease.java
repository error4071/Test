import java.util.Scanner;

class Junk {
    public static void main(String[] arguments) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Выберите нужную опцию: ");
        System.out.println();
        System.out.println("1. Сложение.");
        System.out.println("2. Вычитание. ");
        System.out.println("3. Умножение.");
        System.out.println("4. Деление.");
        System.out.println();

        int x = scanner.nextInt();

        switch (x) {

            case 1:
            System.out.println("Вы выбрали: Сложение."); break;
            case 2:
            System.out.println("Вы выбрали: Вычитание."); break;
            case 3:
            System.out.println("Вы выбрали: Умножение."); break;
            case 4:
            System.out.println("Вы выбрали: Деление."); break;
            default:
            System.out.println("error"); break;
        }


        System.out.println("Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double b = scanner.nextDouble();

        while (true) {

            if (x == 1) {
                System.out.println(a + b);
            }
            if (x == 2) {
                System.out.println(a - b);
            }
            if (x == 3) {
                System.out.println(a * b);
            }
            if (x == 4) {
                System.out.println(a / b);
            }
            break;
        }
    }
}

