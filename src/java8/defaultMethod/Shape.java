package java8.defaultMethod;

public interface Shape {
    void draw();
    default void setColor() {
        System.out.println("this is default method set color");
    }
}

