package java8.defaultMethod;

interface Interface1 {
     default void method() {
        System.out.println("default method 1");
    }
}

interface Interface2 {
     default void method() {
        System.out.println("default method 2");
    }
}

public class MultipleInheritanceDefaultMethod implements Interface1, Interface2{
    @Override
    public void method() {
        Interface1.super.method();
    }
}
