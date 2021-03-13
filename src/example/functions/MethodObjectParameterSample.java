package example.functions;

public class MethodObjectParameterSample {

    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.name = "Ali";
        c1.lastName = "Tut";

        System.out.println("before method call");
        System.out.println("name in main scope: " + c1.name);
        System.out.println("lastname in main scope: " + c1.lastName);

        clone(c1);

        System.out.println("after method call");
        System.out.println("name in main scope: " + c1.name);
        System.out.println("lastname in main scope: " + c1.lastName);
    }

    private static void clone(Customer customer) {

        customer = new Customer();
        customer.name = "Ayşe";
        customer.lastName = "Yurt";

        System.out.println("method scope");
        System.out.println("name in method scope: " + customer.name);
        System.out.println("lastname in method scope: " + customer.lastName);
    }

    private static void print(Customer customer) {

        customer.name = "Ayşe";
        customer.lastName = "Yurt";

        System.out.println("method scope");
        System.out.println("name in method scope: " + customer.name);
        System.out.println("lastname in method scope: " + customer.lastName);
    }
}
