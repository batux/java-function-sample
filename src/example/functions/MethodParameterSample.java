package example.functions;

public class MethodParameterSample {

    public static void main(String[] args) {

        int a = 10;
        int b = 50;

        System.out.println("Before method call");
        System.out.println("a in Main Scope: " + a);
        System.out.println("b in Main Scope: " + b);

        mathFunction(a, b);

        System.out.println("After method call");
        System.out.println("a in Main Scope: " + a);
        System.out.println("b in Main Scope: " + b);
    }

    private static void mathFunction(int number1, int number2) {

        number1 = number1 * 2;
        number2 = number2 * 2;

        System.out.println("Number1 in Method Scope: " + number1);
        System.out.println("Number2 in Method Scope: " + number2);

        int result = number1 * number2;
        System.out.println("Result: " + result);
    }

}
