package java8.methodReference;

public class MethodReference {
    public static void main(String[] args) {
        int a = 5;
        int b = 123;

        MathUtils mathUtils = new MathUtils();

        System.out.println(doAction(a, b, (x, y) -> x + y));
        System.out.println(doAction(a, b, mathUtils::minus));
        System.out.println("ạodoaisjdoaisjdoasd");
    }

    public static int doAction(int a, int b, Execute func) {
        return func.execute(a, b);

    }

}
