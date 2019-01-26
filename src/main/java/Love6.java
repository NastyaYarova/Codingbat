package main.java;

public class Love6 {

    public boolean love6(int a, int b) {
        int sum = Math.abs(a) + Math.abs(b);
        int dif = Math.abs(a) - Math.abs(b);
        int dif2 = Math.abs(b) - Math.abs(a);
        if (a==6 || b==6 || sum==6 || dif==6 || dif2==6){
            return true;
        }else
            return false;

    }

    public static void main(String[] args) {

        Love6 love6 = new Love6();
        boolean love6one = love6.love6(7, 2);
        System.out.println(love6one);

        boolean love6two = love6.love6(6, 6);
        System.out.println(love6two);

        boolean love6three = love6.love6(-7, 1);
        System.out.println(love6three);

        boolean love6four = love6.love6(-2, -4);
        System.out.println(love6four);
    }

}
