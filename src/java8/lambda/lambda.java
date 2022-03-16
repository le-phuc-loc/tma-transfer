package java8.lambda;


public class lambda {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("This is how to create and run lambda");
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("asojdoiasjd");
            }
        };
        runnable.run();
    }
}
