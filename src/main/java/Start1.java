package main.java;

public class Start1 {

    public int start1(int[] a, int[] b) {


        if (a.length == 0 && b.length == 0) {
            return 0;
        } else if ((a.length == 0 && b[0] == 1) || (b.length == 0 && a[0] == 1)) {
            return 1;
        } else if (a[0] == 1 && b[0] == 1) {
            return 2;
        } else if (a[0] == 1 || b[0] == 1) {
            return 1;
        } else
            return 0;


    }


    public static void main(String[] args) {
        Start1 start1 = new Start1();
        int[] a = {1,3,4};
        int[] b = {1,3};
        int start1One = start1.start1(a, b);
        System.out.println(start1One);


        int[] a1 = {0,3,4};
        int[] b1 = {1,3,7,9};
        int start1Two = start1.start1(a1, b1);
        System.out.println(start1Two);

        int[] a2 = {7};
        int[] b2 = {};
        int start1Three = start1.start1(a2, b2);
        System.out.println(start1Three);
    }

}
