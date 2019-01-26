package main.java;

public class HasBad {

    public boolean hasBad(String str) {

        if (str.length() > 3) {

            String str0 = str.substring(0, 3);
            String str1 = str.substring(1, 4);

            if (str0.equals("bad") || str1.equals("bad")) {
                return true;
            } else
                return false;

        } else if (str.length() == 3){
            String str0 = str.substring(0, 3);
            if (str0.equals("bad") ){
                return true;
            } else
                return false;
        } else
            return false;

    }

    public static void main(String[] args) {
        HasBad hasBad = new HasBad();
        boolean hasBadOne = hasBad.hasBad("xbadxx");
        System.out.println(hasBadOne);

        boolean hasBadTwo = hasBad.hasBad("bad");
        System.out.println(hasBadTwo);
    }
}
