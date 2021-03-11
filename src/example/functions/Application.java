package example.functions;

import java.util.Scanner;

public class Application {

    public enum ValidationCode {
        SUCCESS, EXIT, INVALID_OPERATION;
    }

    public static void main(String[] args) {

        showMenu();
        run();
    }

    private static void run() {

        int choice = 0;
        do {
            choice = selectOperation();
            if(validate(choice) == ValidationCode.INVALID_OPERATION) {
                System.out.println("Invalid operation...");
                continue;
            }
            if(validate(choice) == ValidationCode.EXIT) {
                System.out.println("Good Bye :)");
                break;
            }
            double total = applyOperation(choice);
            System.out.println("Sonuç: " + total);
        } while(true);
    }

    private static void showMenu() {

        System.out.println("1- Toplama");
        System.out.println("2- Çıkarma");
        System.out.println("3- Çarpma");
        System.out.println("4- Bölme");
        System.out.println("5- Çıkış");
    }

    private static int selectOperation() {

        System.out.println("Operasyon seçiniz...");
        Scanner scanner = new Scanner(System.in);

        int operationType = 0;
        try {
            operationType = scanner.nextInt();
        }
        catch(Exception e) {
            System.err.println(e);
        }
        return operationType;
    }

    private static ValidationCode validate(int choice) {

        if(choice == 0) {
            return ValidationCode.INVALID_OPERATION;
        }
        if(choice == 5) {
            return ValidationCode.EXIT;
        }
        return ValidationCode.SUCCESS;
    }

    private static double applyOperation(int choice) {

        double total = 0;
        double number1 = typeNumber();
        double number2 = typeNumber();

        switch (choice) {
            case 1:
                total = sum(number1, number2);
                break;
            case 2:
                total = sub(number1, number2);
                break;
            case 3:
                total = multiply(number1, number2);
                break;
            case 4:
                total = div(number1, number2);
                break;
            default:
                System.out.println("Geçersiz işlem...");
        }
        return total;
    }

    private static double typeNumber() {
        System.out.println("Bir sayi giriniz:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static double sum(double number1, double number2) {

        return number1 + number2;
    }

    private static double sub(double number1, double number2) {

        return number1 - number2;
    }

    private static double multiply(double number1, double number2) {

        return number1 * number2;
    }

    private static double div(double number1, double number2) {

        if(number2 == 0) {
            return 0;
        }

        return number1 / number2;
    }
}
