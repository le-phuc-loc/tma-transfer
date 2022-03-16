package java8.defaultMethod;

public class DefaultMethod {
    public static void main(String args[])  //static method
    {
        Circle c = new Circle();
        c.setColor();
        c.draw();

        Rect r = new Rect();
        r.setColor();
        r.draw();

        MultipleInheritanceDefaultMethod multipleInheritanceDefaultMethod = new MultipleInheritanceDefaultMethod();
        multipleInheritanceDefaultMethod.method();

    }
}
