package main.java;

public class Main {

    public static class A {
        int a;
    }

    public static void main(String[] args) {
        A a = new A();
        a.a = 2;

        main2(a);
        System.out.println("?" + a.a);
    }

    public static void main2(A a) {
        A a2 = new A();
        a2.a = 3;
        a = a2;
    }

//    .java -> .class -> jmv
//    .grovy
//    .scala
//    .kotlin

}
